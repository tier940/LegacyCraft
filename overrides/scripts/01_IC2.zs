# Imoprts
import mods.jei.JEI;
import mods.ctintegration.projecte.EMCManager;

EMCManager.mapEMC();



########################################
# Items
########################################
# Treetap
<ic2:itemtreetap>.emc = 40;

# Dust Coal
<ic2:itemmisc:6>.emc = 0;

# Dust Charcoal
<ic2:itemmisc:12>.emc = 0;

# Refined Iron Ingot
<ic2:itemmisc:53>.emc = 0;



########################################
# Blocks
########################################
# Solar Panel
JEI.removeAndHide(<ic2:blockgenerator:3>);
recipes.removeByRecipeName("vrgenerator:vrgenerator.visibleraysolar.visibleray1");
recipes.addShaped(<vrgenerator:visibleraysolar>, [
    [<ic2:itemmisc:12>, <ore:blockGlass>, <ic2:itemmisc:12>],
    [<ore:blockGlass>, <ic2:itemmisc:12>, <ore:blockGlass>],
    [<ic2:itemmisc:451>, <ic2:blockgenerator>, <ic2:itemmisc:451>]
]);
recipes.addShaped(<vrgenerator:visibleraysolar>, [
    [<ic2:itemmisc:6>, <ore:blockGlass>, <ic2:itemmisc:6>],
    [<ore:blockGlass>, <ic2:itemmisc:6>, <ore:blockGlass>],
    [<ic2:itemmisc:451>, <ic2:blockgenerator>, <ic2:itemmisc:451>]
]);

# Solar Turbine
recipes.remove(<ic2:blockgenerator:9>);
recipes.addShaped(<ic2:blockgenerator:9>, [
    [<ic2:itemmisc:257>, <vrgenerator:visibleraysolar>, <ic2:itemmisc:257>],
    [<ic2:blockmachinelv:11>, <ic2:itemmisc:304>, <ic2:blockmachinelv:11>],
    [<ic2:itemmisc:257>, <ic2:blockmachinemv>, <ic2:itemmisc:257>]
]);

# Solar Helmet
recipes.remove(<ic2:itemsolarhelmets:0>);
recipes.remove(<ic2:itemsolarhelmets:1>);

# LV Solar Panel
JEI.removeAndHide(<ic2:blockcompactedgenerator:0>);

# MV Solar Panel
JEI.removeAndHide(<ic2:blockcompactedgenerator:1>);

# HV Solar Panel
JEI.removeAndHide(<ic2:blockcompactedgenerator:2>);

# VisibleRay Generator 1 EU/t
recipes.removeShapeless(<vrgenerator:visibleraysolar>, [<ic2:blockgenerator:3>, <ic2:itemmisc:452>]);

# [Another] CE Permanent lite generator 512 EU/t
recipes.addShaped(<vrgenerator:visibleraysolar:8>, [
    [<ic2:itemmisc:256>, <minecraft:glowstone>, <ic2:itemmisc:256>],
    [<vrgenerator:visibleraysolar:3>, <ic2:blockelectric:9>, <vrgenerator:visibleraysolar:3>],
    [<ic2:itemmisc:256>, <minecraft:glowstone>, <ic2:itemmisc:256>]
]);
<vrgenerator:visibleraysolar:8>.emc = 0;

# Small Electric Flux Generator (LV)
<ic2:blockcompactedgenerator:6>.emc = 1652;

# Medium Electric Flux Generator (MV)
<ic2:blockcompactedgenerator:7>.emc = 5048;

# Big Electric Flux Generator (HV)
<ic2:blockcompactedgenerator:8>.emc = 25260;



EMCManager.mapEMC();
