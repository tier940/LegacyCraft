// BuildCraft + QuarryPlus recipe changes
import post.classes.AssemblyTable

// ── BuildCraft ────────────────────────────────────────────────────────────────

// Builder
mods.minecraft.crafting.shapedBuilder()
    .output(item('buildcraftbuilders:builder'))
    .shape([
        [item('minecraft:dye'),    item('buildcraftcore:marker_volume'), item('minecraft:dye')],
        [item('minecraft:dye', 11), item('minecraft:crafting_table'),   item('minecraft:dye', 11)],
        [item('buildcraftcore:gear_diamond'), item('minecraft:chest'),  item('buildcraftcore:gear_diamond')]
    ])
    .register()

// Electronic Library
mods.minecraft.crafting.shapedBuilder()
    .output(item('buildcraftbuilders:library'))
    .shape([
        [item('buildcraftbuilders:snapshot', 2), item('buildcraftbuilders:snapshot', 2), item('buildcraftbuilders:snapshot', 2)],
        [item('buildcraftbuilders:snapshot', 2), item('minecraft:bookshelf'),            item('buildcraftbuilders:snapshot', 2)],
        [item('buildcraftbuilders:snapshot', 2), item('buildcraftbuilders:snapshot', 2), item('buildcraftbuilders:snapshot', 2)]
    ])
    .register()

// Kinesis Pipes - remove default recipes and hide from JEI
mods.minecraft.crafting.remove('buildcrafttransport:pipe_wood_rf_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_cobble_rf_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_stone_rf_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_wood_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_cobble_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_stone_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_quartz_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_iron_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_gold_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_sandstone_power_colorless')
mods.minecraft.crafting.remove('buildcrafttransport:pipe_diamond_power_colorless')
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_wood_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_cobble_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_stone_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_quartz_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_iron_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_gold_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_sandstone_power'))
mods.jei.ingredient.hide(item('buildcrafttransport:pipe_diamond_power'))

// Power Pipes
mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_wood_power'))
    .input([item('buildcrafttransport:pipe_wood_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_cobble_power'))
    .input([item('buildcrafttransport:pipe_cobble_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_stone_power'))
    .input([item('buildcrafttransport:pipe_stone_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_quartz_power'))
    .input([item('buildcrafttransport:pipe_quartz_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_iron_power'))
    .input([item('buildcrafttransport:pipe_iron_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_gold_power'))
    .input([item('buildcrafttransport:pipe_gold_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_sandstone_power'))
    .input([item('buildcrafttransport:pipe_sandstone_item'), ore('dustRedstone')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('buildcrafttransport:pipe_diamond_power'))
    .input([item('buildcrafttransport:pipe_diamond_item'), ore('dustRedstone')])
    .register()

// ── QuarryPlus (Assembly Table) ───────────────────────────────────────────────

// WorkbenchPlus は未使用のため JEI から非表示
mods.jei.category.hideCategory('quarryplus.workbenchplus')

// Items
AssemblyTable.register('marker_plus', 320000, item('quarryplus:markerplus'), [
    AssemblyTable.ing(item('buildcraftcore:marker_volume')),
    AssemblyTable.ingOre('ingotGold',      7),
    AssemblyTable.ingOre('ingotIron',      8),
    AssemblyTable.ingOre('dustRedstone',  11),
    AssemblyTable.ingOre('gemLapis',      11),
    AssemblyTable.ingOre('dustGlowstone',  4)
])

AssemblyTable.register('status_checker', 80000, item('quarryplus:tool'), [
    AssemblyTable.ingOre('gemDiamond',     4),
    AssemblyTable.ingOre('ingotGold',     16),
    AssemblyTable.ingOre('ingotIron',     24),
    AssemblyTable.ingOre('dustRedstone',  32),
    AssemblyTable.ingOre('gemLapis',       8),
    AssemblyTable.ingOre('obsidian',       4)
])

AssemblyTable.register('liquid_selector', 320000, item('quarryplus:tool', 2), [
    AssemblyTable.ingOre('ingotIron',               64),
    AssemblyTable.ing(item('minecraft:lava_bucket'),  2),
    AssemblyTable.ing(item('minecraft:water_bucket'), 2)
])

AssemblyTable.register('quarry_y_setter', 80000, item('quarryplus:tool', 3), [
    AssemblyTable.ingOre('ingotGold',              32),
    AssemblyTable.ing(item('minecraft:repeater'),   16),
    AssemblyTable.ing(item('minecraft:comparator'),  8),
    AssemblyTable.ingOre('gemQuartz',              64)
])

AssemblyTable.register('list_editor', 160000, item('quarryplus:tool', 1).withNbt(['HideFlags': 1]), [
    AssemblyTable.ingOre('gemDiamond',           4),
    AssemblyTable.ingOre('ingotIron',           16),
    AssemblyTable.ingOre('dustRedstone',         4),
    AssemblyTable.ing(item('minecraft:dye'),    16),
    AssemblyTable.ing(item('minecraft:book'),   64),
    AssemblyTable.ing(item('minecraft:feather'), 2)
])

AssemblyTable.register('list_template', 80000, item('quarryplus:template').withNbt(['HideFlags': 1]), [
    AssemblyTable.ing(item('quarryplus:tool', 1).withNbt(['HideFlags': 1]), 2),
    AssemblyTable.ingOre('chest')
])

AssemblyTable.register('quarry_torch_module', 640000, item('quarryplus:torch_module'), [
    AssemblyTable.ing(item('torchmaster:mega_torch'),        4),
    AssemblyTable.ing(item('ic2:blockmetal', 12),           28),
    AssemblyTable.ing(item('minecraft:dispenser'),          16),
    AssemblyTable.ing(item('minecraft:daylight_detector'),  64),
    AssemblyTable.ing(item('minecraft:comparator'),         64)
])

AssemblyTable.register('quarry_fuel_module', 3200, item('quarryplus:fuel_module_normal'), [
    AssemblyTable.ing(item('minecraft:furnace'), 3),
    AssemblyTable.ingOre('blockGold',           16)
])

// Blocks
AssemblyTable.register('laser_plus', 640000, item('quarryplus:laserplus'), [
    AssemblyTable.ing(item('buildcraftsilicon:laser')),
    AssemblyTable.ingOre('gemDiamond',              14),
    AssemblyTable.ingOre('ingotGold',               32),
    AssemblyTable.ingOre('ingotIron',                8),
    AssemblyTable.ing(item('minecraft:redstone_block'), 16),
    AssemblyTable.ingOre('obsidian',                30),
    AssemblyTable.ing(item('buildcraftfactory:tank'), 18)
])

AssemblyTable.register('quarry_plus', 320000, item('quarryplus:quarry'), [
    AssemblyTable.ing(item('buildcraftbuilders:quarry')),
    AssemblyTable.ingOre('gemDiamond',   11),
    AssemblyTable.ingOre('ingotGold',    16),
    AssemblyTable.ingOre('ingotIron',    36),
    AssemblyTable.ingOre('dustRedstone', 15),
    AssemblyTable.ingOre('enderpearl',    4)
])

AssemblyTable.register('pump_plus', 320000, item('quarryplus:pumpplus'), [
    AssemblyTable.ing(item('buildcraftfactory:pump')),
    AssemblyTable.ingOre('ingotGold',         16),
    AssemblyTable.ingOre('ingotIron',         37),
    AssemblyTable.ingOre('dustRedstone',      63),
    AssemblyTable.ing(item('buildcraftfactory:tank'), 62),
    AssemblyTable.ing(item('ic2:itemmisc', 350),      10)
])

AssemblyTable.register('miningwell_plus', 160000, item('quarryplus:miningwellplus'), [
    AssemblyTable.ing(item('buildcraftfactory:mining_well')),
    AssemblyTable.ingOre('gemDiamond',    2),
    AssemblyTable.ingOre('ingotGold',     6),
    AssemblyTable.ingOre('ingotIron',    19),
    AssemblyTable.ingOre('dustRedstone', 15),
    AssemblyTable.ingOre('enderpearl',    2)
])

AssemblyTable.register('refinery_plus', 640000, item('quarryplus:refineryplus'), [
    AssemblyTable.ing(item('buildcraftfactory:distiller')),
    AssemblyTable.ingOre('gemDiamond',             32),
    AssemblyTable.ingOre('ingotGold',              20),
    AssemblyTable.ingOre('ingotIron',              20),
    AssemblyTable.ing(item('buildcraftfactory:tank'), 12),
    AssemblyTable.ingOre('dustRedstone',           30),
    AssemblyTable.ing(item('minecraft:anvil'),      2),
    AssemblyTable.ingOre('obsidian',               24),
    AssemblyTable.ingOre('enderpearl')
])

AssemblyTable.register('advanced_pump', 3200000, item('quarryplus:standalonepump'), [
    AssemblyTable.ing(item('quarryplus:quarry'),     2),
    AssemblyTable.ing(item('quarryplus:pumpplus'),   2),
    AssemblyTable.ing(item('quarryplus:markerplus'), 3)
])

AssemblyTable.register('chunk_destroyer', 3200000, item('quarryplus:chunkdestroyer'), [
    AssemblyTable.ing(item('quarryplus:quarry'),     3),
    AssemblyTable.ing(item('quarryplus:pumpplus'),   2),
    AssemblyTable.ing(item('quarryplus:markerplus'), 3),
    AssemblyTable.ingOre('blockDiamond',            8),
    AssemblyTable.ingOre('blockEmerald',            8),
    AssemblyTable.ing(item('minecraft:ender_eye'), 64),
    AssemblyTable.ingOre('netherStar',              2),
    AssemblyTable.ing(item('minecraft:skull', 5))
])

AssemblyTable.register('experience_pump', 3200000, item('quarryplus:exppump'), [
    AssemblyTable.ingOre('ingotGold',              16),
    AssemblyTable.ingOre('ingotIron',              48),
    AssemblyTable.ingOre('dustRedstone',           64),
    AssemblyTable.ing(item('minecraft:experience_bottle'), 2),
    AssemblyTable.ing(item('minecraft:hay_block'),        32),
    AssemblyTable.ingOre('enderpearl',              2)
])

AssemblyTable.register('enchant_mover', 320000, item('quarryplus:enchantmover'), [
    AssemblyTable.ing(item('minecraft:enchanting_table')),
    AssemblyTable.ingOre('gemDiamond',  30),
    AssemblyTable.ingOre('ingotGold',    8),
    AssemblyTable.ingOre('ingotIron',    8),
    AssemblyTable.ingOre('dustRedstone', 48),
    AssemblyTable.ingOre('obsidian',    60),
    AssemblyTable.ing(item('minecraft:anvil'), 2),
    AssemblyTable.ingOre('enderpearl',   2)
])

// ── Akuto Engine ──────────────────────────────────────────────────────────────

// Tank EX - hide from JEI
mods.jei.ingredient.removeAndHide(item('akutoengine:tankex'))
