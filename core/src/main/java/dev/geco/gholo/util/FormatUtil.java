package dev.geco.gholo.util;

import java.util.*;
import java.util.Map.*;

import org.bukkit.entity.*;

import me.clip.placeholderapi.*;

import dev.geco.gholo.GHoloMain;
import dev.geco.gholo.manager.*;
import dev.geco.gholo.objects.*;

public class FormatUtil {

    private final GHoloMain GPM;

    public FormatUtil(GHoloMain GPluginMain) { GPM = GPluginMain; }

    /*public String formatBase(String Text) { return GPM.getMManager().toFormattedMessage(formatSymbols(Text)); }

    public String formatPlaceholders(String Text, Player Player) {
        return formatPlaceholdersWithAnimations(Text, Player, GPM.getHoloAnimationManager().getAnimations());
    }

    public String formatPlaceholdersWithAnimations(String Text, Player Player, Collection<GHoloAnimation> Animations) {
        for(GHoloAnimation animation : Animations) Text = Text.replace(HoloAnimationManager.AMIMATION_CHAR + animation.getId() + HoloAnimationManager.AMIMATION_CHAR, animation.getCurrentContent());
        return formatPlaceholdersWithoutAnimations(Text, Player);
    }

    public String formatPlaceholdersWithoutAnimations(String Text, Player Player) {
        if(GPM.getCManager().L_PLACEHOLDER_API && GPM.hasPlaceholderAPILink()) Text = PlaceholderAPI.setPlaceholders(Player, Text);
        return Text;
    }

    public String formatSymbols(String Text) {
        for(Entry<String, String> symbol : GPM.getCManager().SYMBOLS.entrySet()) {
            String key = symbol.getKey();
            String value = symbol.getValue();
            Text = Text.replace(key, value);
        }
        return Text;
    }

    public long getTicksForAnimation(String Text) {
        long minTicks = 0;
        for(GHoloAnimation animation : GPM.getHoloAnimationManager().getAnimationSet().values()) {
            if(minTicks < 1 || animation.getTicks() < minTicks) minTicks = animation.getTicks();
        }
        return minTicks < 1 ? 1 : minTicks;
    }*/

}