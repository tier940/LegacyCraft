import buildcraft.api.mj.MjAPI
import buildcraft.api.recipes.AssemblyRecipeBasic
import buildcraft.api.recipes.IngredientStack
import buildcraft.lib.recipe.AssemblyRecipeRegistry
import com.google.common.collect.ImmutableSet
import net.minecraft.item.crafting.Ingredient
import net.minecraft.util.ResourceLocation
import net.minecraftforge.oredict.OreIngredient

/**
 * Helper class for registering BuildCraft Assembly Table recipes.
 */
class AssemblyTable {

    /** GrS IIngredient → IngredientStack (count is applied at the IngredientStack level) */
    static IngredientStack ing(def iIngredient, int count = 1) {
        new IngredientStack(Ingredient.fromStacks(iIngredient.getMatchingStacks()), count)
    }

    /** OreDict name → IngredientStack */
    static IngredientStack ingOre(String oreName, int count = 1) {
        new IngredientStack(new OreIngredient(oreName), count)
    }

    /** Register a recipe in the Assembly Table (energy specified in MJ) */
    static void register(String name, long mj, def output, List<IngredientStack> inputs) {
        AssemblyRecipeRegistry.register(new AssemblyRecipeBasic(
            new ResourceLocation('lc', name),
            mj * MjAPI.MJ,
            ImmutableSet.copyOf(inputs),
            output.getMatchingStacks()[0]
        ))
    }

}
