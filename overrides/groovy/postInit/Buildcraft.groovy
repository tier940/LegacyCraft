mods.jei.category.remove('quarryplus.workbenchplus')



// ########################################
// # Blocks
// ########################################
// Buildcraft - Builder
crafting.shapedBuilder()
        .name('builder')
        .output(item('buildcraftbuilders:builder'))
        .row('BMB')
        .row('YTY')
        .row('DCD')
        .key('B', item('minecraft:dye'))
        .key('Y', item('minecraft:dye', 11))
        .key('M', ore('plankWood'))
        .key('T', item('minecraft:crafting_table'))
        .key('C', ore('chestWood'))
        .key('D', ore('gemDiamond'))
        .register()

// Buildcraft - Electronic Library
crafting.shapedBuilder()
        .name('library')
        .output(item('buildcraftbuilders:library'))
        .row('SSS')
        .row('SBS')
        .row('SSS')
        .key('S', item('buildcraftbuilders:snapshot', 2))
        .key('B', item('minecraft:bookshelf'))
        .register()

// Buildcraft - Kinesis Pipes
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
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_wood_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_cobble_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_stone_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_quartz_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_iron_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_gold_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_sandstone_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_diamond_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_diamond_wood_power'))

// Buildcraft - Wooden Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_wood_rf'), [item('buildcrafttransport:pipe_wood_item'), ore('dustRedstone')])

// Buildcraft - Cobblestone Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_cobble_rf'), [item('buildcrafttransport:pipe_cobble_item'), ore('dustRedstone')])

// Buildcraft - Stone Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_stone_rf'), [item('buildcrafttransport:pipe_stone_item'), ore('dustRedstone')])

// Buildcraft - Quartz Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_quartz_rf'), [item('buildcrafttransport:pipe_quartz_item'), ore('dustRedstone')])

// Buildcraft - Iron Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_iron_rf'), [item('buildcrafttransport:pipe_iron_item'), ore('dustRedstone')])

// Buildcraft - Gold Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_gold_rf'), [item('buildcrafttransport:pipe_gold_item'), ore('dustRedstone')])

// Buildcraft - Sandstone Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_sandstone_rf'), [item('buildcrafttransport:pipe_sandstone_item'), ore('dustRedstone')])

// Buildcraft - Diamond Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_diamond_rf'), [item('buildcrafttransport:pipe_diamond_item'), ore('dustRedstone')])

// Buildcraft - Wooden Diamond Redstone Flux Pipe
crafting.addShapeless(item('buildcrafttransport:pipe_diamond_wood_rf'), [item('buildcrafttransport:pipe_diamond_wood_item'), ore('dustRedstone')])

// Akuto Engine - Tank EX
mods.jei.ingredient.removeAndHide(item('akutoengine:tankex'))
