package org.example;

import org.example.model.metadata.Icone;
import org.example.model.metadata.Metadonnees;
import org.example.model.metadata.UsineMetadata;

import javax.swing.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class IconCache {

    public static final String SEPARATOR = "--";
    private final Map<String, ImageIcon> cache = new HashMap<>();

    public ImageIcon get(Metadonnees metadonnees, String type, String stage) {

        String key = getKey(type, stage);
        ImageIcon imageIconCached = cache.get(key);
        if(imageIconCached != null) {
            return imageIconCached;
        }

        UsineMetadata usineMetadata = loadMetadata(metadonnees, type);
        Icone icon = getIcon(usineMetadata, stage);
        URL resource = getClass().getClassLoader().getResource(icon.getPath());
        ImageIcon imageIcon = new ImageIcon(resource);
        cache.put(key, imageIcon);
        return imageIcon;
    }

    private String getKey(String type, String stage) {
        return type + SEPARATOR + stage;
    }

    private Icone getIcon(UsineMetadata usineMetadata, String stage) {

        if(stage == null) {
            return usineMetadata.getIcones().getIcone().get(0);
        }

        for (Icone icone: usineMetadata.getIcones().getIcone()) {
            if(icone.getType().equals(stage)) {
                return icone;
            }
        }
        throw new IllegalArgumentException("stage " + stage + " is not present in metadata");
    }

    private UsineMetadata loadMetadata(Metadonnees metadonnees, String type) {
        for (UsineMetadata usineMetadata: metadonnees.getUsine()) {
            if(usineMetadata.getType().equals(type)) {
                return usineMetadata;
            }
        }
        throw new IllegalArgumentException("type " + type + " is not present in metadata");
    }
}
