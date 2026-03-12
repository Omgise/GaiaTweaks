package henrykado.gaiablossom.common.block;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import henrykado.gaiablossom.common.block.tileentity.TileEntityMobSpawnerTower;

public class BlockMobSpawnerTower extends BlockMobSpawner {

    public BlockMobSpawnerTower(String name, String textureName) {
        this.setHardness(5.0F)
            .setStepSound(soundTypeMetal);

        setBlockTextureName("mob_spawner");
        ModBlock.registerBlock(this, name, false);

        setCreativeTab(CreativeTabs.tabAllSearch);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityMobSpawnerTower();
    }
}
