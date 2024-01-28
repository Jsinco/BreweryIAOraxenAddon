package dev.jsinco;

import com.dre.brewery.recipe.PluginItem;
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.inventory.ItemStack;

public class ItemsAdderPluginItem extends PluginItem {
    @Override
    public boolean matches(ItemStack itemStack) {
        if (!IAOraxenAddon.isUsingItemsAdder()) {
            return false;
        }
        return CustomStack.byItemStack(itemStack) != null;
    }
}
