package dev.geco.gholo.object;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface IGHoloRowEntity {

    void loadHoloRow();

    void loadHoloRow(@NotNull Player player);

    void publishUpdate(@NotNull GHoloRowUpdateType updateType);

    void unloadHoloRow();

    void unloadHoloRow(@NotNull Player player);

}