package dev.jsinco;

import com.dre.brewery.recipe.PluginItem;
import io.th0rgal.oraxen.api.OraxenItems;
import org.bukkit.inventory.ItemStack;

public class OraxenPluginItem extends PluginItem {
    @Override
    public boolean matches(ItemStack itemStack) {
        if (!IAOraxenAddon.isUsingOraxen()) {
            return false;
        }
        return OraxenItems.getIdByItem(itemStack) != null;
    }
}
