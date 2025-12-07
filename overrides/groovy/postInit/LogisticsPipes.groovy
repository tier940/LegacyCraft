//// ########################################
//// # Items
//// ########################################
//// Logistics Pipes' Guide Book
//mods.jei.ingredient.removeAndHide(item('logisticspipes:guide_book'))
//
//// Nano Hopper
//mods.jei.ingredient.hide(item('logisticspipes:parts', 3))
//
//// Logistics Broken Item
//mods.jei.ingredient.hide(item('logisticspipes:broken_item'))
//
//// Logistics Item Card
//mods.jei.ingredient.hide(item('logisticspipes:item_card'))
//
//// Logistics Controller Upgrade
//mods.jei.ingredient.hide(item('logisticspipes:upgrade_logic_controller'))
//
//// Raw Basic Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_basic_raw'))
//
//// Basic Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_basic'))
//
//// Raw Advanced Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_advanced_raw'))
//
//// Advanced Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_advanced'))
//
//// Raw FPGA Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_fpga_raw'))
//
//// FPGA Chip
//mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_fpga'))
//
//// Pipe Controller
//crafting.remove(item('logisticspipes:pipe_controller'))
//crafting.addShaped(item('logisticspipes:pipe_controller'), [
//    [item('minecraft:gold_ingot'), item('buildcraftcore:wrench'), item('minecraft:gold_ingot')],
//    [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//
//// Pipe Manager
//crafting.remove(item('logisticspipes:pipe_manager'))
//crafting.addShaped(item('logisticspipes:pipe_manager'), [
//    [item('minecraft:iron_ingot'), item('buildcraftcore:wrench'), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//
//// Logistics programmer
//mods.jei.ingredient.removeAndHide(item('logisticspipes:logistics_programmer'))
//
//// Logistics HUD Glasses
//crafting.addShaped(item('logisticspipes:hud_glasses'), [
//    [item('logisticspipes:parts'), null, item('logisticspipes:parts')],
//    [item('logisticspipes:parts', 1), item('logisticspipes:parts', 2), item('logisticspipes:parts', 1)],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:parts', 2), [
//    [null, item('buildcraftsilicon:redstone_chipset', 4), null],
//    [item('minecraft:diamond'), null, item('minecraft:diamond')],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:parts', 1), [
//    [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:redstone')],
//    [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:redstone')],
//    [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')]])
//crafting.addShaped(item('logisticspipes:parts'), [
//    [null, null, null],
//    [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')],
//    [null, null, item('buildcraftsilicon:redstone_chipset', 4)]])
//
//// Crafting Sign Creator
//crafting.remove(item('logisticspipes:sign_creator'))
//crafting.addShaped(item('logisticspipes:sign_creator'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, item('buildcraftsilicon:redstone_chipset', 2)],
//    [null, item('minecraft:sign'), null],
//    [null, item('buildcraftsilicon:redstone_chipset', 4), null]])
//crafting.addShaped(item('logisticspipes:sign_creator'), [
//    [item('buildcraftcore:gear_gold'), null, item('buildcraftcore:gear_gold')],
//    [null, item('minecraft:sign'), null],
//    [null, item('buildcraftcore:gear_diamond'), null]])
//
//// Blank Module
//crafting.remove(item('logisticspipes:module_blank'))
//crafting.addShaped(item('logisticspipes:module_blank'), [
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
//    [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]])
//
//// ItemSink Module
//crafting.remove(item('logisticspipes:module_item_sink'))
//crafting.addShaped(item('logisticspipes:module_item_sink'), [
//    [item('minecraft:dye', 2), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 2)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 2), item('minecraft:redstone'), item('minecraft:dye', 2)]])
//crafting.addShaped(item('logisticspipes:module_item_sink'), [
//    [item('minecraft:dye', 2), item('buildcraftcore:gear_iron'), item('minecraft:dye', 2)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 2), item('minecraft:redstone'), item('minecraft:dye', 2)]])
//crafting.addShapeless(item('logisticspipes:module_item_sink'), [item('logisticspipes:module_item_sink')])
//
//// Mod Based ItemSink Module
//crafting.remove(item('logisticspipes:module_item_sink_mod'))
//crafting.addShaped(item('logisticspipes:module_item_sink_mod'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:module_item_sink'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:module_item_sink_mod'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:module_item_sink'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_item_sink_mod'), [item('logisticspipes:module_item_sink_mod')])
//
//// OreDict ItemSink Module
//crafting.remove(item('logisticspipes:module_item_sink_oredict'))
//crafting.addShaped(item('logisticspipes:module_item_sink_oredict'), [
//    [item('minecraft:book'), null, null],
//    [item('logisticspipes:module_item_sink_mod'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_item_sink_oredict'), [item('logisticspipes:module_item_sink_oredict')])
//
//// Creative Tab Based ItemSink Module
//crafting.remove(item('logisticspipes:module_item_sink_creativetab'))
//crafting.addShaped(item('logisticspipes:module_item_sink_creativetab'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:module_item_sink_oredict'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:module_item_sink_creativetab'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:module_item_sink_oredict'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_item_sink_creativetab'), [item('logisticspipes:module_item_sink_creativetab')])
//
//// Passive Supplier Module
//crafting.remove(item('logisticspipes:module_passive_supplier'))
//crafting.addShaped(item('logisticspipes:module_passive_supplier'), [
//    [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 1)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 1), item('minecraft:redstone'), item('minecraft:dye', 1)]])
//crafting.addShaped(item('logisticspipes:module_passive_supplier'), [
//    [item('minecraft:dye', 1), item('buildcraftcore:gear_iron'), item('minecraft:dye', 1)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 1), item('minecraft:redstone'), item('minecraft:dye', 1)]])
//crafting.addShapeless(item('logisticspipes:module_passive_supplier'), [item('logisticspipes:module_active_supplier')])
//
//// Active Supplier Module
//crafting.remove(item('logisticspipes:module_active_supplier'))
//crafting.addShapeless(item('logisticspipes:module_active_supplier'), [item('logisticspipes:module_passive_supplier')])
//
//// Extractor Module
//crafting.remove(item('logisticspipes:module_extractor'))
//crafting.addShaped(item('logisticspipes:module_extractor'), [
//    [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShaped(item('logisticspipes:module_extractor'), [
//    [item('minecraft:dye', 4), item('buildcraftcore:gear_iron'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShapeless(item('logisticspipes:module_extractor'), [item('logisticspipes:module_extractor')])
//
//// Advanced Extractor Module
//crafting.remove(item('logisticspipes:module_extractor_advanced'))
//crafting.addShaped(item('logisticspipes:module_extractor_advanced'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:module_extractor'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:module_extractor_advanced'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:module_extractor'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_extractor_advanced'), [item('logisticspipes:module_extractor_advanced')])
//
//// Polymorphic ItemSink Module
//crafting.remove(item('logisticspipes:module_item_sink_polymorphic'))
//crafting.addShaped(item('logisticspipes:module_item_sink_polymorphic'), [
//    [item('minecraft:dye', 14), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye', 14)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 14), item('minecraft:redstone'), item('minecraft:dye', 14)]])
//crafting.addShaped(item('logisticspipes:module_item_sink_polymorphic'), [
//    [item('minecraft:dye', 14), item('buildcraftcore:gear_gold'), item('minecraft:dye', 14)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 14), item('minecraft:redstone'), item('minecraft:dye', 14)]])
//crafting.addShapeless(item('logisticspipes:module_item_sink_polymorphic'), [item('logisticspipes:module_item_sink_polymorphic')])
//
//// QuickSort Module
//crafting.remove(item('logisticspipes:module_quick_sort'))
//crafting.addShaped(item('logisticspipes:module_quick_sort'), [
//    [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShaped(item('logisticspipes:module_quick_sort'), [
//    [item('minecraft:dye', 4), item('buildcraftcore:gear_diamond'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShapeless(item('logisticspipes:module_quick_sort'), [item('logisticspipes:module_quick_sort')])
//
//// Terminus Module
//crafting.remove(item('logisticspipes:module_terminus'))
//crafting.addShaped(item('logisticspipes:module_terminus'), [
//    [item('minecraft:dye', 5), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye')],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye'), item('minecraft:redstone'), item('minecraft:dye', 5)]])
//crafting.addShaped(item('logisticspipes:module_terminus'), [
//    [item('minecraft:dye', 5), item('buildcraftcore:gear_iron'), item('minecraft:dye')],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye'), item('minecraft:redstone'), item('minecraft:dye', 5)]])
//crafting.addShapeless(item('logisticspipes:module_terminus'), [item('logisticspipes:module_terminus')])
//
//// Provider Module
//crafting.remove(item('logisticspipes:module_provider'))
//crafting.addShaped(item('logisticspipes:module_provider'), [
//    [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShaped(item('logisticspipes:module_provider'), [
//    [item('minecraft:dye', 4), item('buildcraftcore:gear_gold'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]])
//crafting.addShapeless(item('logisticspipes:module_provider'), [item('logisticspipes:module_provider')])
//
//// Enchantment Sink Module MK1
//crafting.remove(item('logisticspipes:module_enchantment_sink'))
//crafting.addShaped(item('logisticspipes:module_enchantment_sink'), [
//    [item('minecraft:enchanted_book'), null, null],
//    [item('logisticspipes:module_item_sink'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_enchantment_sink'), [item('logisticspipes:module_enchantment_sink')])
//
//// Enchantment Sink Module MK2
//crafting.remove(item('logisticspipes:module_enchantment_sink_mk2'))
//crafting.addShaped(item('logisticspipes:module_enchantment_sink_mk2'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:module_enchantment_sink'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:module_enchantment_sink_mk2'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:module_enchantment_sink'), null, null],
//    [null, null, null]])
//crafting.addShapeless(item('logisticspipes:module_enchantment_sink_mk2'), [item('logisticspipes:module_enchantment_sink_mk2')])
//
//// Crafting Module
//crafting.remove(item('logisticspipes:module_crafter'))
//crafting.addShaped(item('logisticspipes:module_crafter'), [
//    [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]])
//crafting.addShaped(item('logisticspipes:module_crafter'), [
//    [item('minecraft:dye', 1), item('buildcraftcore:gear_iron'), item('minecraft:dye', 4)],
//    [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
//    [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]])
//crafting.addShapeless(item('logisticspipes:module_crafter'), [item('logisticspipes:module_crafter')])
//
//// Crafting Byproduct Extraction Upgrade
//crafting.remove(item('logisticspipes:upgrade_crafting_byproduct'))
//crafting.addShaped(item('logisticspipes:upgrade_crafting_byproduct'), [
//    [item('minecraft:redstone'), item('buildcraftcore:gear_wood'), item('minecraft:redstone')],
//    [item('buildcraftcore:gear_wood'), item('buildcraftsilicon:redstone_chipset', 1), item('buildcraftcore:gear_wood')],
//    [item('minecraft:redstone'), item('buildcraftcore:gear_wood'), item('minecraft:redstone')]])
//
//// Fluid Crafting Upgrade
//crafting.remove(item('logisticspipes:upgrade_fluid_crafting'))
//crafting.addShaped(item('logisticspipes:upgrade_fluid_crafting'), [
//    [item('minecraft:redstone'), item('minecraft:glass_bottle'), item('minecraft:redstone')],
//    [item('minecraft:glass_bottle'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:glass_bottle')],
//    [item('minecraft:redstone'), item('minecraft:glass_bottle'), item('minecraft:redstone')]])
//
//// Sneaky Upgrade
//crafting.remove(item('logisticspipes:upgrade_sneaky'))
//crafting.addShaped(item('logisticspipes:upgrade_sneaky'), [
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
//    [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]])
//
//// Sneaky Combination Upgrade
//crafting.remove(item('logisticspipes:upgrade_sneaky_combination'))
//crafting.addShaped(item('logisticspipes:upgrade_sneaky_combination'), [
//    [item('minecraft:slime_ball'), item('minecraft:redstone'), item('minecraft:slime_ball')],
//    [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]])
//
//// Power Transportation Upgrade
//crafting.remove(item('logisticspipes:upgrade_power_transportation'))
//crafting.addShaped(item('logisticspipes:upgrade_power_transportation') * 4, [
//    [item('minecraft:paper'), item('minecraft:redstone_block'), item('minecraft:paper')],
//    [item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:glowstone'), item('buildcraftsilicon:redstone_chipset', 1)],
//    [item('minecraft:paper'), item('minecraft:lapis_block'), item('minecraft:paper')]])
//crafting.addShaped(item('logisticspipes:upgrade_power_transportation') * 4, [
//    [item('minecraft:paper'), item('minecraft:redstone_block'), item('minecraft:paper')],
//    [item('buildcraftcore:gear_iron'), item('minecraft:glowstone'), item('buildcraftcore:gear_iron')],
//    [item('minecraft:paper'), item('minecraft:lapis_block'), item('minecraft:paper')]])
//
//// Item Speed Upgrade
//crafting.remove(item('logisticspipes:upgrade_speed'))
//crafting.addShaped(item('logisticspipes:upgrade_speed'), [
//    [item('minecraft:paper'), item('minecraft:gold_ingot'), item('minecraft:paper')],
//    [item('minecraft:gold_ingot'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:gold_ingot')],
//    [item('minecraft:paper'), item('minecraft:gold_ingot'), item('minecraft:paper')]])
//
//// Disconnection Upgrade
//crafting.remove(item('logisticspipes:upgrade_disconnection'))
//crafting.addShaped(item('logisticspipes:upgrade_disconnection') * 8, [
//    [item('minecraft:iron_ingot'), item('minecraft:redstone'), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]])
//
//// Advanced Satellite Upgrade
//crafting.remove(item('logisticspipes:upgrade_satellite_advanced'))
//crafting.addShaped(item('logisticspipes:upgrade_satellite_advanced'), [
//    [item('minecraft:paper'), item('minecraft:iron_ingot'), item('minecraft:paper')],
//    [item('minecraft:iron_ingot'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:iron_ingot')],
//    [item('minecraft:paper'), item('minecraft:iron_ingot'), item('minecraft:paper')]])
//
//// Placement Rules Upgrade
//crafting.remove(item('logisticspipes:upgrade_pattern'))
//crafting.addShaped(item('logisticspipes:upgrade_pattern'), [
//    [item('minecraft:redstone'), item('minecraft:hopper'), item('minecraft:dye', 11)],
//    [item('minecraft:iron_ingot'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:iron_ingot')],
//    [item('minecraft:dye', 1), item('minecraft:iron_ingot'), item('minecraft:redstone')]])
//
//// Fuzzy Upgrade
//crafting.remove(item('logisticspipes:upgrade_fuzzy'))
//crafting.addShaped(item('logisticspipes:upgrade_fuzzy'), [
//    [item('minecraft:paper'), item('minecraft:quartz'), item('minecraft:paper')],
//    [item('minecraft:quartz'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:quartz')],
//    [item('minecraft:paper'), item('minecraft:quartz'), item('minecraft:paper')]])
//
//// Crafting Monitoring Upgrade
//crafting.remove(item('logisticspipes:upgrade_crafting_monitoring'))
//crafting.addShaped(item('logisticspipes:upgrade_crafting_monitoring'), [
//    [item('minecraft:redstone'), item('minecraft:dye', 4), item('minecraft:redstone')],
//    [item('minecraft:dye', 2), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 11)],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_chassis_mk2'), item('minecraft:redstone')]])
//
//// Opaque Upgrade
//crafting.remove(item('logisticspipes:upgrade_opaque'))
//crafting.addShaped(item('logisticspipes:upgrade_opaque'), [
//    [item('minecraft:redstone'), item('minecraft:dye', 15), item('minecraft:redstone')],
//    [item('minecraft:dye', 15), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 15)],
//    [item('minecraft:redstone'), item('minecraft:dye', 15), item('minecraft:redstone')]])
//
//// Crafting Cleanup Upgrade
//crafting.remove(item('logisticspipes:upgrade_crafting_cleanup'))
//crafting.addShaped(item('logisticspipes:upgrade_crafting_cleanup'), [
//    [item('minecraft:redstone'), item('minecraft:dye', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:paper')],
//    [item('minecraft:redstone'), item('logisticspipes:module_extractor'), item('minecraft:redstone')]])
//crafting.addShaped(item('logisticspipes:upgrade_crafting_cleanup'), [
//    [item('minecraft:redstone'), item('minecraft:dye', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:paper')],
//    [item('minecraft:redstone'), item('logisticspipes:module_extractor_advanced'), item('minecraft:redstone')]])
//
//// Module Upgrade
//crafting.remove(item('logisticspipes:upgrade_module_upgrade'))
//crafting.addShaped(item('logisticspipes:upgrade_module_upgrade'), [
//    [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')],
//    [item('minecraft:dye'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye')],
//    [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]])
//
//// Action Speed Upgrade
//crafting.remove(item('logisticspipes:upgrade_action_speed'))
//crafting.addShaped(item('logisticspipes:upgrade_action_speed'), [
//    [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')],
//    [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]])
//
//// Item Extraction Upgrade
//crafting.remove(item('logisticspipes:upgrade_item_extraction'))
//crafting.addShaped(item('logisticspipes:upgrade_item_extraction'), [
//    [item('minecraft:redstone'), item('minecraft:dye', 2), item('minecraft:redstone')],
//    [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:paper')],
//    [item('minecraft:redstone'), item('logisticspipes:module_extractor_advanced'), item('minecraft:redstone')]])
//
//// ItemSink Extraction Upgrade
//crafting.remove(item('logisticspipes:upgrade_item_stack_extraction'))
//crafting.addShaped(item('logisticspipes:upgrade_item_stack_extraction'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:upgrade_item_extraction'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:upgrade_item_stack_extraction'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:upgrade_item_extraction'), null, null],
//    [null, null, null]])
//
//// MJ Power Supplier Upgrade
//mods.jei.ingredient.removeAndHide(item('logisticspipes:upgrade_power_supplier_mj'))
//
//// RF Power Supplier Upgrade
//crafting.addShaped(item('logisticspipes:upgrade_power_supplier_rf'), [
//    [item('minecraft:paper'), item('buildcraftcore:engine', 2), item('minecraft:paper')],
//    [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:upgrade_power_transportation'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:paper')]])
//
//// EU LV Power Supplier Upgrade
//crafting.addShaped(item('logisticspipes:upgrade_power_supplier_eu_lv'), [
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
//    [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_transportation'), item('ic2:ic2upgrades')],
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]])
//
//// EU MV Power Supplier Upgrade
//crafting.addShaped(item('logisticspipes:upgrade_power_supplier_eu_mv'), [
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
//    [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_lv'), item('ic2:ic2upgrades')],
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]])
//
//// EU HV Power Supplier Upgrade
//crafting.addShaped(item('logisticspipes:upgrade_power_supplier_eu_hv'), [
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
//    [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_mv'), item('ic2:ic2upgrades')],
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]])
//
//// EU EV Power Supplier Upgrade
//crafting.addShaped(item('logisticspipes:upgrade_power_supplier_eu_ev'), [
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
//    [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_hv'), item('ic2:ic2upgrades')],
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]])
//
//// Remote Orderer
//crafting.remove(item('logisticspipes:remote_orderer'))
//crafting.addShaped(item('logisticspipes:remote_orderer'), [
//    [item('minecraft:glass'), item('minecraft:glass'), null],
//    [item('minecraft:glass'), item('minecraft:glass'), null],
//    [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 4), null]])
//crafting.addShaped(item('logisticspipes:remote_orderer'), [
//    [item('minecraft:glass'), item('minecraft:glass'), null],
//    [item('minecraft:glass'), item('minecraft:glass'), null],
//    [item('buildcraftcore:gear_diamond'), item('buildcraftcore:gear_diamond'), null]])
//
//
//// ########################################
//// # Blocks
//// ########################################
//// Unrouted Transport Pipe
//crafting.remove(item('logisticspipes:pipe_transport_basic'))
//crafting.addShaped(item('logisticspipes:pipe_transport_basic'), [
//    [item('minecraft:iron_ingot'), item('minecraft:glass_pane'), item('minecraft:iron_ingot')],
//    [null, item('minecraft:redstone'), null],
//    [null, null, null]])
//
//// Basic Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_basic'))
//crafting.addShapeless(item('logisticspipes:pipe_basic'), [item('logisticspipes:pipe_request') | item('logisticspipes:pipe_provider') | item('logisticspipes:pipe_crafting') | item('logisticspipes:pipe_satellite') | item('logisticspipes:pipe_supplier') | item('logisticspipes:pipe_chassis_mk1') | item('logisticspipes:pipe_chassis_mk2') | item('logisticspipes:pipe_chassis_mk3') | item('logisticspipes:pipe_chassis_mk4') | item('logisticspipes:pipe_chassis_mk5') | item('logisticspipes:pipe_request_mk2') | item('logisticspipes:pipe_remote_orderer') | item('logisticspipes:pipe_inventory_system_connector') | item('logisticspipes:pipe_system_entrance') | item('logisticspipes:pipe_system_destination') | item('logisticspipes:pipe_firewall') | item('logisticspipes:pipe_fluid_supplier') | item('logisticspipes:pipe_fluid_basic') | item('logisticspipes:pipe_fluid_request') | item('logisticspipes:pipe_fluid_provider') | item('logisticspipes:pipe_fluid_insertion') | item('logisticspipes:pipe_fluid_extractor') | item('logisticspipes:pipe_fluid_satellite') | item('logisticspipes:pipe_fluid_supplier_mk2')])
//crafting.addShaped(item('logisticspipes:pipe_basic') * 8, [
//    [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')],
//    [item('buildcraftsilicon:redstone_chipset', 2), item('buildcrafttransport:pipe_diamond_item'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')]])
//crafting.addShaped(item('logisticspipes:pipe_basic') * 8, [
//    [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')],
//    [item('buildcraftcore:gear_gold'), item('buildcrafttransport:pipe_diamond_item'), item('buildcraftcore:gear_gold')],
//    [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')]])
//
//// Request Logistics Pipe MK1
//crafting.remove(item('logisticspipes:pipe_request'))
//crafting.addShaped(item('logisticspipes:pipe_request'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [null, null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_request'), [
//    [item('buildcraftcore:gear_gold'), item('logisticspipes:pipe_basic'), item('buildcraftcore:gear_gold')],
//    [null, null, null],
//    [null, null, null]])
//
//// Request Logistics Pipe MK2
//crafting.remove(item('logisticspipes:pipe_request_mk2'))
//crafting.addShaped(item('logisticspipes:pipe_request_mk2'), [
//    [item('buildcraftsilicon:redstone_chipset', 4), null, null],
//    [item('logisticspipes:pipe_request'), null, null],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_request_mk2'), [
//    [item('buildcraftcore:gear_diamond'), null, null],
//    [item('logisticspipes:pipe_request'), null, null],
//    [item('minecraft:redstone'), null, null]])
//
//// Provider Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_provider'))
//crafting.addShaped(item('logisticspipes:pipe_provider'), [
//    [item('minecraft:glowstone_dust'), null, null],
//    [item('logisticspipes:pipe_basic'), null, null],
//    [null, null, null]])
//
//// Crafting Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_crafting'))
//crafting.addShaped(item('logisticspipes:pipe_crafting'), [
//    [item('minecraft:glowstone_dust'), item('logisticspipes:pipe_basic'), item('minecraft:glowstone_dust')],
//    [null, null, null],
//    [null, null, null]])
//
//// Satellite Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_satellite'))
//crafting.addShaped(item('logisticspipes:pipe_satellite'), [
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [null, null, null],
//    [null, null, null]])
//
//// Supplier Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_supplier'))
//crafting.addShaped(item('logisticspipes:pipe_supplier'), [
//    [item('minecraft:dye', 4), item('logisticspipes:pipe_basic'), item('minecraft:dye', 4)],
//    [null, null, null],
//    [null, null, null]])
//
//// Logistics Chassis MK1
//crafting.remove(item('logisticspipes:pipe_chassis_mk1'))
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk1'), [
//    [null, item('buildcraftsilicon:redstone_chipset'), null],
//    [item('buildcraftsilicon:redstone_chipset'), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset')],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk1'), [
//    [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')]])
//
//// Logistics Chassis MK2
//crafting.remove(item('logisticspipes:pipe_chassis_mk2'))
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk2'), [
//    [null, item('buildcraftsilicon:redstone_chipset', 1), null],
//    [item('buildcraftsilicon:redstone_chipset', 1), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 1)],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk2'), [
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')],
//    [item('minecraft:iron_ingot'), item('logisticspipes:pipe_basic'), item('minecraft:iron_ingot')],
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]])
//
//// Logistics Chassis MK3
//crafting.remove(item('logisticspipes:pipe_chassis_mk3'))
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk3'), [
//    [null, item('buildcraftsilicon:redstone_chipset', 2), null],
//    [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk3'), [
//    [item('minecraft:gold_ingot'), item('minecraft:gold_ingot'), item('minecraft:gold_ingot')],
//    [item('minecraft:gold_ingot'), item('logisticspipes:pipe_basic'), item('minecraft:gold_ingot')],
//    [item('minecraft:gold_ingot'), item('minecraft:gold_ingot'), item('minecraft:gold_ingot')]])
//
//// Logistics Chassis MK4
//crafting.remove(item('logisticspipes:pipe_chassis_mk4'))
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk4'), [
//    [null, item('buildcraftsilicon:redstone_chipset', 4), null],
//    [item('buildcraftsilicon:redstone_chipset', 4), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 4)],
//    [null, null, null]])
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk4'), [
//    [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')],
//    [item('minecraft:diamond'), item('logisticspipes:pipe_basic'), item('minecraft:diamond')],
//    [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')]])
//
//// Logistics Chassis MK5
//crafting.remove(item('logisticspipes:pipe_chassis_mk5'))
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk5'), [
//    [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 2), item('buildcraftsilicon:redstone_chipset', 4)],
//    [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 2), item('buildcraftsilicon:redstone_chipset', 4)]])
//crafting.addShaped(item('logisticspipes:pipe_chassis_mk5'), [
//    [item('minecraft:diamond_block'), item('minecraft:gold_block'), item('minecraft:diamond_block')],
//    [item('minecraft:gold_block'), item('logisticspipes:pipe_basic'), item('minecraft:gold_block')],
//    [item('minecraft:diamond_block'), item('minecraft:gold_block'), item('minecraft:diamond_block')]])
//
//// Remote Orderer Logistics Pipe
//crafting.remove(item('logisticspipes:pipe_remote_orderer'))
//crafting.addShaped(item('logisticspipes:pipe_remote_orderer'), [
//    [item('minecraft:ender_pearl'), null, null],
//    [item('logisticspipes:pipe_basic'), null, null],
//    [item('minecraft:redstone'), null, null]])
//
//// Logistics Inventory System Connector
//crafting.remove(item('logisticspipes:pipe_inventory_system_connector'))
//crafting.addShaped(item('logisticspipes:pipe_inventory_system_connector'), [
//    [null, item('minecraft:ender_pearl'), null],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [null, null, null]])
//
//// Logistics System Entrance Pipe
//crafting.remove(item('logisticspipes:pipe_system_entrance'))
//crafting.addShaped(item('logisticspipes:pipe_system_entrance'), [
//    [item('minecraft:dye', 2), null, null],
//    [item('logisticspipes:pipe_provider'), null, null],
//    [null, null, null]])
//
//// Logistics System Destination Pipe
//crafting.remove(item('logisticspipes:pipe_system_destination'))
//crafting.addShaped(item('logisticspipes:pipe_system_destination'), [
//    [item('minecraft:dye', 1), null, null],
//    [item('logisticspipes:pipe_provider'), null, null],
//    [null, null, null]])
//
//// Logistics Firewall Pipe
//crafting.remove(item('logisticspipes:pipe_firewall'))
//crafting.addShaped(item('logisticspipes:pipe_firewall'), [
//    [item('minecraft:nether_brick'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:nether_brick')],
//    [null, item('logisticspipes:pipe_basic'), null],
//    [item('minecraft:nether_brick'), null, item('minecraft:nether_brick')]])
//
//// Logistics Fluid Basic Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_basic'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_basic'), [
//    [item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof')],
//    [item('minecraft:bucket'), item('logisticspipes:pipe_basic'), item('minecraft:bucket')],
//    [item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof')]])
//
//// Logistics Fluid Request Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_request'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_request'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:pipe_fluid_basic'), null, null],
//    [item('buildcraftcore:gear_iron'), null, null]])
//crafting.addShaped(item('logisticspipes:pipe_fluid_request'), [
//    [item('buildcraftcore:gear_gold'), null, null],
//    [item('logisticspipes:pipe_fluid_basic'), null, null],
//    [item('buildcraftcore:gear_iron'), null, null]])
//
//// Logistics Fluid Provider Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_provider'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_provider'), [
//    [item('buildcraftsilicon:redstone_chipset', 2), null, null],
//    [item('logisticspipes:pipe_fluid_basic'), null, null],
//    [item('minecraft:redstone_torch'), null, null]])
//crafting.addShaped(item('logisticspipes:pipe_fluid_provider'), [
//    [null, item('buildcraftcore:gear_gold'), null],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:redstone')],
//    [null, null, null]])
//
//// Logistics Fluid Container Supplier Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_supplier'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_supplier'), [
//    [item('minecraft:dye', 4), item('logisticspipes:pipe_basic'), item('minecraft:dye', 4)],
//    [null, item('minecraft:bucket'), null],
//    [null, null, null]])
//
//// Logistics Fluid Supplier Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_supplier_mk2'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_supplier_mk2'), [
//    [item('minecraft:dye', 4), item('logisticspipes:pipe_fluid_basic'), item('minecraft:dye', 4)],
//    [null, null, null],
//    [null, null, null]])
//
//// Logistics Fluid Satellite Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_satellite'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_satellite'), [
//    [item('minecraft:redstone'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:redstone')],
//    [null, null, null],
//    [null, null, null]])
//
//// Logistics Fluid Insertion Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_insertion'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_insertion'), [
//    [null, item('minecraft:glass_bottle'), null],
//    [item('minecraft:glass_bottle'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:glass_bottle')],
//    [null, item('minecraft:glass_bottle'), null]])
//
//// Logistics Fluid Extractor Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_extractor'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_extractor'), [
//    [item('buildcrafttransport:pipe_wood_fluid'), null, null],
//    [item('logisticspipes:pipe_fluid_basic'), null, null],
//    [null, null, null]])
//
//// Logistics Fluid Terminus Pipe
//crafting.remove(item('logisticspipes:pipe_fluid_terminus'))
//crafting.addShaped(item('logisticspipes:pipe_fluid_terminus'), [
//    [item('minecraft:dye'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:dye', 5)],
//    [null, null, null],
//    [null, null, null]])
//
//// Logistics Block Frame
//mods.jei.ingredient.removeAndHide(item('logisticspipes:frame'))
//
//// Logistics Crafting Table
//crafting.remove(item('logisticspipes:crafting_table'))
//crafting.addShaped(item('logisticspipes:crafting_table'), [
//    [ore('plankWood'), item('minecraft:crafting_table'), ore('plankWood')],
//    [null, item('buildcraftcore:gear_stone'), null],
//    [ore('plankWood'), ore('chestWood'), ore('plankWood')]])
//
//// Logistics Fuzzy Crafting Table
//crafting.remove(item('logisticspipes:crafting_table_fuzzy'))
//crafting.addShapeless(item('logisticspipes:crafting_table_fuzzy'), [item('logisticspipes:crafting_table'), item('minecraft:quartz')])
//
//// Logistics Request Table
//crafting.remove(item('logisticspipes:pipe_request_table'))
//crafting.addShaped(item('logisticspipes:pipe_request_table'), [
//    [item('minecraft:stonebrick'), item('minecraft:crafting_table'), item('minecraft:stonebrick')],
//    [item('logisticspipes:pipe_crafting'), item('minecraft:hopper'), item('logisticspipes:pipe_request_mk2')],
//    [item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:chest'), item('buildcraftsilicon:redstone_chipset', 4)]])
//crafting.addShaped(item('logisticspipes:pipe_request_table'), [
//    [item('minecraft:stonebrick'), item('minecraft:crafting_table'), item('minecraft:stonebrick')],
//    [item('logisticspipes:pipe_crafting'), item('minecraft:hopper'), item('logisticspipes:pipe_request_mk2')],
//    [item('buildcraftcore:gear_diamond'), item('minecraft:chest'), item('buildcraftcore:gear_diamond')]])
//
//// Logistics Security Station
//crafting.remove(item('logisticspipes:security_station'))
//crafting.addShaped(item('logisticspipes:security_station'), [
//    [item('minecraft:iron_ingot'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]])
//crafting.addShaped(item('logisticspipes:security_station'), [
//    [item('minecraft:iron_ingot'), item('buildcraftcore:gear_diamond'), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]])
//
//// Logistics Power Junction
//mods.jei.ingredient.removeAndHide(item('logisticspipes:power_junction'))
//
//// Logistics Program Compiler
//mods.jei.ingredient.removeAndHide(item('logisticspipes:program_compiler'))
//
//// Logistics Statistics Table
//crafting.remove(item('logisticspipes:statistics_table'))
//crafting.addShaped(item('logisticspipes:statistics_table'), [
//    [item('minecraft:iron_ingot'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]])
//crafting.addShaped(item('logisticspipes:statistics_table'), [
//    [item('minecraft:iron_ingot'), item('buildcraftcore:gear_gold'), item('minecraft:iron_ingot')],
//    [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
//    [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]])
//
//// MJ Power Provider
//mods.jei.ingredient.removeAndHide(item('logisticspipes:power_provider_mj'))
//
//// RF Power Provider
//crafting.addShaped(item('logisticspipes:power_provider_rf'), [
//    [item('minecraft:paper'), item('buildcraftcore:engine', 2), item('minecraft:paper')],
//    [item('buildcraftsilicon:redstone_chipset', 2), ore('blockRedstone'), item('buildcraftsilicon:redstone_chipset', 2)],
//    [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:paper')]])
//
//// EU Power Provider
//crafting.addShaped(item('logisticspipes:power_provider_eu'), [
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
//    [item('ic2:ic2upgrades'), ore('blockRedstone'), item('ic2:ic2upgrades')],
//    [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]])
