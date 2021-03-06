package twilightforest;

import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import twilightforest.entity.*;
import twilightforest.entity.boss.EntityTFHydra;
import twilightforest.entity.boss.EntityTFKnightPhantom;
import twilightforest.entity.boss.EntityTFLich;
import twilightforest.entity.boss.EntityTFMinoshroom;
import twilightforest.entity.boss.EntityTFNaga;
import twilightforest.entity.boss.EntityTFSnowQueen;
import twilightforest.entity.boss.EntityTFUrGhast;
import twilightforest.entity.boss.EntityTFYetiAlpha;
import twilightforest.entity.passive.EntityTFBighorn;
import twilightforest.entity.passive.EntityTFBoar;
import twilightforest.entity.passive.EntityTFDeer;
import twilightforest.entity.passive.EntityTFQuestRam;
import twilightforest.entity.passive.EntityTFRaven;
import twilightforest.entity.passive.EntityTFTinyBird;

@Mod.EventBusSubscriber(modid = TwilightForestMod.ID)
public final class TFSounds {

	public static final SoundEvent KOBOLD_DEATH = createEvent("mob.kobold.die");
	public static final SoundEvent KOBOLD_AMBIENT = createEvent("mob.kobold.kobold");
	public static final SoundEvent KOBOLD_HURT = createEvent("mob.kobold.hurt");
	public static final SoundEvent CICADA = createEvent("mob.cicada");
	public static final SoundEvent NAGA_HISS = createEvent("mob.naga.hiss");
	public static final SoundEvent NAGA_HURT = createEvent("mob.naga.hurt");
	public static final SoundEvent NAGA_RATTLE = createEvent("mob.naga.rattle");
	public static final SoundEvent RAVEN_CAW = createEvent("mob.raven.caw");
	public static final SoundEvent RAVEN_SQUAWK = createEvent("mob.raven.squawk");
	public static final SoundEvent REDCAP_DEATH = createEvent("mob.redcap.die");
	public static final SoundEvent REDCAP_AMBIENT = createEvent("mob.redcap.redcap");
	public static final SoundEvent REDCAP_HURT = createEvent("mob.redcap.hurt");
	public static final SoundEvent TINYBIRD_CHIRP = createEvent("mob.tinybird.chirp");
	public static final SoundEvent TINYBIRD_HURT = createEvent("mob.tinybird.hurt");
	public static final SoundEvent TINYBIRD_SONG = createEvent("mob.tinybird.song");
	public static final SoundEvent URGHAST_TRAP_ACTIVE = createEvent("mob.urghast.trapactive");
	public static final SoundEvent URGHAST_TRAP_ON = createEvent("mob.urghast.trapon");
	public static final SoundEvent URGHAST_TRAP_SPINDOWN = createEvent("mob.urghast.trapspindown");
	public static final SoundEvent URGHAST_TRAP_WARMUP = createEvent("mob.urghast.trapwarmup");
	public static final SoundEvent WRAITH = createEvent("mob.wraith.wraith");
	public static final SoundEvent HYDRA_HURT = createEvent("mob.hydra.hurt");
	public static final SoundEvent HYDRA_DEATH = createEvent("mob.hydra.death");
	public static final SoundEvent HYDRA_GROWL = createEvent("mob.hydra.growl");
	public static final SoundEvent HYDRA_ROAR = createEvent("mob.hydra.roar");
	public static final SoundEvent HYDRA_WARN = createEvent("mob.hydra.warn");
	public static final SoundEvent MOSQUITO = createEvent("mob.mosquito.mosquito");
	public static final SoundEvent ICE_AMBIENT = createEvent("mob.ice.noise");
	public static final SoundEvent ICE_HURT = createEvent("mob.ice.hurt");
	public static final SoundEvent ICE_DEATH = createEvent("mob.ice.death");
	public static final SoundEvent SLIDER = createEvent("random.slider");
	public static final SoundEvent ALPHAYETI_ALERT = createEvent("mob.alphayeti.alert");
	public static final SoundEvent ALPHAYETI_DIE = createEvent("mob.alphayeti.die");
	public static final SoundEvent ALPHAYETI_GRAB = createEvent("mob.alphayeti.grab");
	public static final SoundEvent ALPHAYETI_GROWL = createEvent("mob.alphayeti.growl");
	public static final SoundEvent ALPHAYETI_HURT = createEvent("mob.alphayeti.hurt");
	public static final SoundEvent ALPHAYETI_PANT = createEvent("mob.alphayeti.pant");
	public static final SoundEvent ALPHAYETI_ROAR = createEvent("mob.alphayeti.roar");
	public static final SoundEvent ALPHAYETI_THROW = createEvent("mob.alphayeti.throw");
	public static final SoundEvent DEER_DEATH = createEvent("mob.deer.death");
	public static final SoundEvent DEER_HURT = createEvent("mob.deer.hurt");
	public static final SoundEvent DEER_IDLE = createEvent("mob.deer.idle");
	public static final SoundEvent MISTWOLF_TARGET = createEvent("mob.mistwolf.target");
	public static final SoundEvent MISTWOLF_HURT = createEvent("mob.mistwolf.hurt");
	public static final SoundEvent MISTWOLF_IDLE = createEvent("mob.mistwolf.idle");
	public static final SoundEvent TOME_DEATH = createEvent("mob.tome.death");
	public static final SoundEvent TOME_HURT = createEvent("mob.tome.hurt");
	public static final SoundEvent TOME_IDLE = createEvent("mob.tome.idle");

	public static final SoundEvent MUSIC = createEvent("music.bg");

	private static SoundEvent createEvent(String sound) {
		ResourceLocation name = TwilightForestMod.prefix(sound);
		return new SoundEvent(name).setRegistryName(name);
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(
				KOBOLD_DEATH,
				KOBOLD_AMBIENT,
				KOBOLD_HURT,
				CICADA,
				NAGA_HISS,
				NAGA_HURT,
				NAGA_RATTLE,
				RAVEN_CAW,
				RAVEN_SQUAWK,
				REDCAP_DEATH,
				REDCAP_AMBIENT,
				REDCAP_HURT,
				TINYBIRD_CHIRP,
				TINYBIRD_HURT,
				TINYBIRD_SONG,
				URGHAST_TRAP_ACTIVE,
				URGHAST_TRAP_ON,
				URGHAST_TRAP_SPINDOWN,
				URGHAST_TRAP_WARMUP,
				WRAITH,
				HYDRA_DEATH,
				HYDRA_GROWL,
				HYDRA_HURT,
				HYDRA_ROAR,
				HYDRA_WARN,
				MOSQUITO,
				ICE_AMBIENT,
				ICE_DEATH,
				ICE_HURT,
				SLIDER,
				ALPHAYETI_ALERT,
				ALPHAYETI_DIE,
				ALPHAYETI_GRAB,
				ALPHAYETI_GROWL,
				ALPHAYETI_HURT,
				ALPHAYETI_PANT,
				ALPHAYETI_ROAR,
				ALPHAYETI_THROW,
				DEER_DEATH,
				DEER_HURT,
				DEER_IDLE,
				MISTWOLF_TARGET,
				MISTWOLF_HURT,
				MISTWOLF_IDLE,
				TOME_DEATH,
				TOME_HURT,
				TOME_IDLE
		);

		event.getRegistry().register(MUSIC);

		registerParrotSounds();
	}

	private static void registerParrotSounds() {
		EntityParrot.registerMimicSound(EntityTFKobold.class, KOBOLD_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFRedcap.class, REDCAP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFRedcapSapper.class, REDCAP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFBlockGoblin.class, REDCAP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFBoggard.class, REDCAP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFWraith.class, WRAITH);
		EntityParrot.registerMimicSound(EntityTFMosquitoSwarm.class, MOSQUITO);
		EntityParrot.registerMimicSound(EntityTFIceExploder.class, ICE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFIceShooter.class, ICE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFSnowGuardian.class, ICE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFLoyalZombie.class, SoundEvents.ENTITY_ZOMBIE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFMinotaur.class, SoundEvents.ENTITY_COW_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFKingSpider.class, SoundEvents.ENTITY_SPIDER_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFHedgeSpider.class, SoundEvents.ENTITY_SPIDER_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFSwarmSpider.class, SoundEvents.ENTITY_SPIDER_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFTowerBroodling.class, SoundEvents.ENTITY_SPIDER_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFHostileWolf.class, SoundEvents.ENTITY_WOLF_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFWinterWolf.class, SoundEvents.ENTITY_WOLF_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFSkeletonDruid.class, SoundEvents.ENTITY_SKELETON_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFTowerGhast.class, SoundEvents.ENTITY_GHAST_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFMiniGhast.class, SoundEvents.ENTITY_GHAST_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFTowerTermite.class, SoundEvents.ENTITY_SILVERFISH_AMBIENT);

		EntityParrot.registerMimicSound(EntityTFBighorn.class, SoundEvents.ENTITY_SHEEP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFBoar.class, SoundEvents.ENTITY_PIG_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFDeer.class, DEER_IDLE);
		EntityParrot.registerMimicSound(EntityTFQuestRam.class, SoundEvents.ENTITY_SHEEP_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFRaven.class, RAVEN_CAW);
		EntityParrot.registerMimicSound(EntityTFTinyBird.class, TINYBIRD_CHIRP);

		EntityParrot.registerMimicSound(EntityTFHydra.class, HYDRA_GROWL);
		EntityParrot.registerMimicSound(EntityTFKnightPhantom.class, WRAITH);
		EntityParrot.registerMimicSound(EntityTFLich.class, SoundEvents.ENTITY_BLAZE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFMinoshroom.class, SoundEvents.ENTITY_COW_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFNaga.class, NAGA_RATTLE);
		EntityParrot.registerMimicSound(EntityTFSnowQueen.class, ICE_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFUrGhast.class, SoundEvents.ENTITY_GHAST_AMBIENT);
		EntityParrot.registerMimicSound(EntityTFYetiAlpha.class, ALPHAYETI_GROWL);
	}

	private TFSounds() {}

}
