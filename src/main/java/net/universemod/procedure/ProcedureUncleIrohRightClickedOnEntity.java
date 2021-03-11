package net.universemod.procedure;

import net.universemod.ElementsUniverseMod;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

@ElementsUniverseMod.ModElement.Tag
public class ProcedureUncleIrohRightClickedOnEntity extends ElementsUniverseMod.ModElement {
	public ProcedureUncleIrohRightClickedOnEntity(ElementsUniverseMod instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UncleIrohRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure UncleIrohRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getDouble("scrolls")) != 1)) {
			entity.extinguish();
			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
				entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return entity.world;
					}

					@Override
					public MinecraftServer getServer() {
						return entity.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return entity.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(entity.posX, entity.posY, entity.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return entity;
					}
				}, "give @p avatarmod:scroll");
			}
			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
				entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return entity.world;
					}

					@Override
					public MinecraftServer getServer() {
						return entity.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return entity.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(entity.posX, entity.posY, entity.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return entity;
					}
				}, "give @p avatarmod:scroll");
			}
			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
				entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return entity.world;
					}

					@Override
					public MinecraftServer getServer() {
						return entity.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return entity.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(entity.posX, entity.posY, entity.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return entity;
					}
				}, "give @p avatarmod:scroll");
			}
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Good luck. "), (true));
			}
			entity.world.removeEntity(entity);
			entity.getEntityData().setDouble("scrolls", 1);
		} else {
			entity.getEntityData().setDouble("randNumber", Math.random());
			if (((entity.getEntityData().getDouble("randBumber")) == 1)) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
							"What could be better than finding something you've been looking for? Finding something you weren't looking for - and at a great price too!"),
							(true));
				}
			} else if (((entity.getEntityData().getDouble("randBumber")) >= 0.6)) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
							"In the hardest times, hope is something you give yourself and that is a sign of inner strength."), (true));
				}
			} else if (((entity.getEntityData().getDouble("randBumber")) <= 0.2)) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
							"Sometimes life is like a dark, dark tunnel. You constantly have the feeling that you'll never see a light at the end, but if you keep going nicely, you might get to a nicer place."),
							(true));
				}
			} else {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
							"After Ba Sing Se is freed from tyranny, I will first take back my tea store. Then I will play Pai Sho from morning to night - every day."),
							(true));
				}
			}
		}
	}
}
