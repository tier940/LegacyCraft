mods.jei.category.hideCategory('quarryplus.workbenchplus')



########################################
# Blocks
########################################
# Buildcraft
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
    [<buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>, <buildcraftbuilders:snapshot:2>]
]);

## Kinesis Pipes
crafting.remove(resource('buildcrafttransport:pipe_wood_rf_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_cobble_rf_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_stone_rf_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_wood_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_cobble_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_stone_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_quartz_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_iron_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_gold_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_sandstone_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_diamond_power_colorless'))
crafting.remove(resource('buildcrafttransport:pipe_diamond_wood_power_colorless'))
JEI.hide(<buildcrafttransport:pipe_wood_power>);
JEI.hide(<buildcrafttransport:pipe_cobble_power>);
JEI.hide(<buildcrafttransport:pipe_stone_power>);
JEI.hide(<buildcrafttransport:pipe_quartz_power>);
JEI.hide(<buildcrafttransport:pipe_iron_power>);
JEI.hide(<buildcrafttransport:pipe_gold_power>);
JEI.hide(<buildcrafttransport:pipe_sandstone_power>);
JEI.hide(<buildcrafttransport:pipe_diamond_power>);
JEI.hide(<buildcrafttransport:pipe_diamond_wood_power>);

## Wooden Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_wood_rf>, [<buildcrafttransport:pipe_wood_item>, <ore:dustRedstone>]);

## Cobblestone Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_cobble_rf>, [<buildcrafttransport:pipe_cobble_item>, <ore:dustRedstone>]);

## Stone Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_stone_rf>, [<buildcrafttransport:pipe_stone_item>, <ore:dustRedstone>]);

## Quartz Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_quartz_rf>, [<buildcrafttransport:pipe_quartz_item>, <ore:dustRedstone>]);

## Iron Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_iron_rf>, [<buildcrafttransport:pipe_iron_item>, <ore:dustRedstone>]);

## Gold Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_gold_rf>, [<buildcrafttransport:pipe_gold_item>, <ore:dustRedstone>]);

## Sandstone Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_sandstone_rf>, [<buildcrafttransport:pipe_sandstone_item>, <ore:dustRedstone>]);

## Diamond Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_diamond_rf>, [<buildcrafttransport:pipe_diamond_item>, <ore:dustRedstone>]);

## Wooden Diamond Redstone Flux Pipe
recipes.addShapeless(<buildcrafttransport:pipe_diamond_wood_rf>, [<buildcrafttransport:pipe_diamond_wood_item>, <ore:dustRedstone>]);

# Akuto Engine
## Tank EX
JEI.removeAndHide(<akutoengine:tankex>);
