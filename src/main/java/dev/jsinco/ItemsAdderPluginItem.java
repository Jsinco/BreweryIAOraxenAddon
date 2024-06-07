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

        final CustomStack cs = CustomStack.byItemStack(itemStack);
        if (cs == null) {
            return false;
        }
        return cs.getId().equals(this.getItemId());
    }
}
