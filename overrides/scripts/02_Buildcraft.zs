# Imoprts
import mods.jei.JEI;
import mods.buildcraft.AssemblyTable;
import mods.ctintegration.projecte.EMCManager;
EMCManager.mapEMC();

JEI.hideCategory("quarryplus.workbenchplus");



########################################
# Items
########################################
# Buildcraft
## Redstone Chipset
<buildcraftsilicon:redstone_chipset>.emc = 0;

## Iron Chipset
<buildcraftsilicon:redstone_chipset:1>.emc = 0;

## Gold Chipset
<buildcraftsilicon:redstone_chipset:2>.emc = 0;

## Quartz Chipset
<buildcraftsilicon:redstone_chipset:3>.emc = 0;

## Diamond Chipset
<buildcraftsilicon:redstone_chipset:4>.emc = 0;

# Quarry Plus
## Marker Plus
AssemblyTable.addRecipe("Marker Plus", <quarryplus:markerplus>, 320000, [<buildcraftcore:marker_volume>, <ore:ingotGold> * 7, <ore:ingotIron> * 8, <ore:dustRedstone> * 11, <ore:gemLapis> * 11, <ore:dustGlowstone> * 4]);
<quarryplus:markerplus>.emc = 0;

## Status Checker
AssemblyTable.addRecipe("Status Checker", <quarryplus:tool>, 80000, [<ore:gemDiamond> * 4, <ore:ingotGold> * 16, <ore:ingotIron> * 24, <ore:dustRedstone> * 32, <ore:gemLapis> * 8, <ore:obsidian> * 4]);
<quarryplus:tool>.emc = 0;

## Liquid Selector
AssemblyTable.addRecipe("Liquid Selector", <quarryplus:tool:2>, 320000, [<ore:ingotIron> * 64, <minecraft:lava_bucket> * 2, <minecraft:water_bucket> * 2]);
<quarryplus:tool:2>.emc = 0;

## Quarry Y Setter
AssemblyTable.addRecipe("Quarry Y Setter", <quarryplus:tool:3>, 80000, [<ore:ingotGold> * 32, <minecraft:repeater> * 16, <minecraft:comparator> * 8, <ore:gemQuartz> * 64]);
<quarryplus:tool:3>.emc = 0;

## List Editor
AssemblyTable.addRecipe("List Editor", <quarryplus:tool:1>.withTag({HideFlags: 1}), 160000, [<ore:gemDiamond> * 4, <ore:ingotIron> * 16, <ore:dustRedstone> * 4, <minecraft:dye> * 16, <minecraft:book> * 64, <minecraft:feather> * 2]);
<quarryplus:tool:1>.emc = 0;

## List Template
AssemblyTable.addRecipe("List Template", <quarryplus:template>.withTag({HideFlags: 1}), 80000, [<quarryplus:tool:1>.withTag({HideFlags: 1}) * 2, <ore:chest>]);
<quarryplus:template>.emc = 0;

## Quarry Torch Module
AssemblyTable.addRecipe("Quarry Torch Module", <quarryplus:torch_module>, 640000, [<torchmaster:mega_torch> * 4, <ic2:blockmetal:12> * 28, <minecraft:dispenser> * 16, <minecraft:daylight_detector> * 64, <minecraft:comparator> * 64]);
<quarryplus:torch_module>.emc = 0;

## Quarry Fuel Module
AssemblyTable.addRecipe("Quarry Fuel Module", <quarryplus:fuel_module_normal>, 3200, [<minecraft:furnace> * 3, <ore:blockGold> * 16]);
<quarryplus:fuel_module_normal>.emc = 0;


########################################
# Blocks
########################################
# Buildcraft
## Stone Pipe
<buildcrafttransport:pipe_stone_item>.emc = 1;

## Structure Pipe
<buildcrafttransport:pipe_structure>.emc = 1;

## Pipe Plug
<buildcrafttransport:plug_blocker>.emc = 1;

## Builder
recipes.addShaped(<buildcraftbuilders:builder>, [
    [<minecraft:dye>, <buildcraftcore:marker_volume>, <minecraft:dye>],
    [<minecraft:dye:11>, <minecraft:crafting_table>, <minecraft:dye:11>],
    [<buildcraftcore:gear_diamond>, <minecraft:chest>, <buildcraftcore:gear_diamond>]
]);

## Electronic Library
recipes.addShaped(<buildcraftbuilders:library>, [
    [<buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>],
    [<buildcraftbuilders:snapshot:2>, <minecraft:bookshelf>, <buildcraftbuilders:snapshot:2>],
    [<buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>
]]);

# Quarry Plus
## Laser Plus
AssemblyTable.addRecipe("Laser Plus", <quarryplus:laserplus>, 640000, [<buildcraftsilicon:laser>, <ore:gemDiamond> * 14, <ore:ingotGold> * 32, <ore:ingotIron> * 8, <minecraft:redstone_block> * 16, <ore:obsidian> * 30, <buildcraftfactory:tank> * 18]);
<quarryplus:laserplus>.emc = 0;

## Quarry Plus
AssemblyTable.addRecipe("Quarry Plus", <quarryplus:quarry>, 320000, [<buildcraftbuilders:quarry>, <ore:gemDiamond> * 11, <ore:ingotGold> * 16, <ore:ingotIron> * 36, <ore:dustRedstone> * 15, <ore:enderpearl> * 4]);
<quarryplus:quarry>.emc = 0;

## Pump Plus
AssemblyTable.addRecipe("Pump Plus", <quarryplus:pumpplus>, 320000, [<buildcraftfactory:pump>, <ore:ingotGold> * 16, <ore:ingotIron> * 37, <ore:dustRedstone> * 63, <buildcraftfactory:tank> * 62, <ic2:itemmisc:350> * 10]);
<quarryplus:pumpplus>.emc = 0;

## MiningWell Plus
AssemblyTable.addRecipe("MiningWell Plus", <quarryplus:miningwellplus>, 160000, [<buildcraftfactory:mining_well>, <ore:gemDiamond> * 2, <ore:ingotGold> * 6, <ore:ingotIron> * 19, <ore:dustRedstone> * 15, <ore:enderpearl> * 2]);
<quarryplus:miningwellplus>.emc = 0;

## Refinery Plus
AssemblyTable.addRecipe("Refinery Plus", <quarryplus:refineryplus>, 640000, [<buildcraftfactory:distiller>, <ore:gemDiamond> * 32, <ore:ingotGold> * 20, <ore:ingotIron> * 20, <buildcraftfactory:tank> * 12, <ore:dustRedstone> * 30, <minecraft:anvil> * 2, <ore:obsidian> * 24, <ore:enderpearl>]);
<quarryplus:refineryplus>.emc = 0;

## Advanced Pump
AssemblyTable.addRecipe("Advanced Pump", <quarryplus:standalonepump>, 3200000, [<quarryplus:quarry> * 2, <quarryplus:pumpplus> * 2, <quarryplus:markerplus> * 3]);
<quarryplus:standalonepump>.emc = 0;

## Chunk Destroyer
AssemblyTable.addRecipe("Chunk Destroyer", <quarryplus:chunkdestroyer>, 3200000, [<quarryplus:quarry> * 3, <quarryplus:pumpplus> * 2, <quarryplus:tool:1>.withTag({HideFlags: 1}) * 2, <quarryplus:markerplus> * 3, <ore:blockDiamond> * 8, <ore:blockEmerald> * 8, <minecraft:ender_eye> * 64, <ore:netherStar> * 2, <minecraft:skull:5>]);
<quarryplus:chunkdestroyer>.emc = 0;

## Experience Pump for Quarry
AssemblyTable.addRecipe("Experience Pump for Quarry", <quarryplus:exppump>, 3200000, [<ore:ingotGold> * 16, <ore:ingotIron> * 48, <ore:dustRedstone> * 64, <minecraft:experience_bottle> * 2, <minecraft:hay_block> * 32, <ore:enderpearl> * 2]);
<quarryplus:exppump>.emc = 0;

## Enchant Mover
AssemblyTable.addRecipe("Enchant Mover", <quarryplus:enchantmover>, 320000, [<minecraft:enchanting_table>, <ore:gemDiamond> * 30, <ore:ingotGold> * 8, <ore:ingotIron> * 8, <ore:dustRedstone> * 48, <ore:obsidian> * 60, <minecraft:anvil> * 2, <ore:enderpearl> * 2]);
<quarryplus:enchantmover>.emc = 0;

# Akuto Engine
## Tank EX
JEI.removeAndHide(<akutoengine:tankex>);



EMCManager.mapEMC();
