package io.github.foundationgames.automobility.automobile;

import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.util.SimpleMapContentRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public record AutomobileFrame(
        ResourceLocation id,
        float weight,
        FrameModel model
) implements AutomobileComponent<AutomobileFrame> {
    public static final ResourceLocation ID = Automobility.rl("frame");
    public static final SimpleMapContentRegistry<AutomobileFrame> REGISTRY = new SimpleMapContentRegistry<>();

    public static final AutomobileFrame EMPTY = REGISTRY.register(
            new AutomobileFrame(
                    Automobility.rl("empty"),
                    0.25f,
                    new FrameModel(
                            new ResourceLocation("empty"),
                            Automobility.rl("empty"),
                            WheelBase.basic(16, 16),
                            16, 8, 8, 4, 8, 8
                    )
            )
    );

    public static final AutomobileFrame WOODEN_MOTORCAR = REGISTRY.register(motorcar("wooden", 0.3f));
    public static final AutomobileFrame COPPER_MOTORCAR = REGISTRY.register(motorcar("copper", 0.4f));
    public static final AutomobileFrame STEEL_MOTORCAR = REGISTRY.register(motorcar("steel", 0.475f));
    public static final AutomobileFrame GOLDEN_MOTORCAR = REGISTRY.register(motorcar("golden", 0.525f));
    public static final AutomobileFrame BEJEWELED_MOTORCAR = REGISTRY.register(motorcar("bejeweled", 0.555f));

    public static final AutomobileFrame STANDARD_WHITE = REGISTRY.register(standard("white"));
    public static final AutomobileFrame STANDARD_ORANGE = REGISTRY.register(standard("orange"));
    public static final AutomobileFrame STANDARD_MAGENTA = REGISTRY.register(standard("magenta"));
    public static final AutomobileFrame STANDARD_LIGHT_BLUE = REGISTRY.register(standard("light_blue"));
    public static final AutomobileFrame STANDARD_YELLOW = REGISTRY.register(standard("yellow"));
    public static final AutomobileFrame STANDARD_LIME = REGISTRY.register(standard("lime"));
    public static final AutomobileFrame STANDARD_PINK = REGISTRY.register(standard("pink"));
    public static final AutomobileFrame STANDARD_GRAY = REGISTRY.register(standard("gray"));
    public static final AutomobileFrame STANDARD_LIGHT_GRAY = REGISTRY.register(standard("light_gray"));
    public static final AutomobileFrame STANDARD_CYAN = REGISTRY.register(standard("cyan"));
    public static final AutomobileFrame STANDARD_PURPLE = REGISTRY.register(standard("purple"));
    public static final AutomobileFrame STANDARD_BLUE = REGISTRY.register(standard("blue"));
    public static final AutomobileFrame STANDARD_BROWN = REGISTRY.register(standard("brown"));
    public static final AutomobileFrame STANDARD_GREEN = REGISTRY.register(standard("green"));
    public static final AutomobileFrame STANDARD_RED = REGISTRY.register(standard("red"));
    public static final AutomobileFrame STANDARD_BLACK = REGISTRY.register(standard("black"));

    public static final AutomobileFrame AMETHYST_RICKSHAW = REGISTRY.register(rickshaw("amethyst", 0.2f));
    public static final AutomobileFrame QUARTZ_RICKSHAW = REGISTRY.register(rickshaw("quartz", 0.25f));
    public static final AutomobileFrame PRISMARINE_RICKSHAW = REGISTRY.register(rickshaw("prismarine", 0.14f));
    public static final AutomobileFrame ECHO_RICKSHAW = REGISTRY.register(rickshaw("echo", 0.1f));

    public static final AutomobileFrame RED_TRACTOR = REGISTRY.register(tractor("red"));
    public static final AutomobileFrame YELLOW_TRACTOR = REGISTRY.register(tractor("yellow"));
    public static final AutomobileFrame GREEN_TRACTOR = REGISTRY.register(tractor("green"));
    public static final AutomobileFrame BLUE_TRACTOR = REGISTRY.register(tractor("blue"));

    public static final AutomobileFrame JEEP_RED = REGISTRY.register(jeep("red"));
    public static final AutomobileFrame JEEP_ORANGE = REGISTRY.register(jeep("orange"));
    public static final AutomobileFrame JEEP_YELLOW = REGISTRY.register(jeep("yellow"));
    public static final AutomobileFrame JEEP_GREEN = REGISTRY.register(jeep("green"));
    public static final AutomobileFrame JEEP_BLUE = REGISTRY.register(jeep("blue"));
    public static final AutomobileFrame JEEP_INDIGO = REGISTRY.register(jeep("indigo"));
    public static final AutomobileFrame JEEP_VIOLET = REGISTRY.register(jeep("violet"));
    public static final AutomobileFrame JEEP_WHITE = REGISTRY.register(jeep("white"));
    public static final AutomobileFrame JEEP_BLACK = REGISTRY.register(jeep("black"));

    public static final AutomobileFrame BEETLE_PINK = REGISTRY.register(beetle("pink"));
    public static final AutomobileFrame BEETLE_TEAL = REGISTRY.register(beetle("teal"));
    public static final AutomobileFrame BEETLE_BLUE = REGISTRY.register(beetle("blue"));
    public static final AutomobileFrame BEETLE_YELLOW = REGISTRY.register(beetle("yellow"));
    public static final AutomobileFrame BEETLE_MAUVE = REGISTRY.register(beetle("mauve"));
    public static final AutomobileFrame BEETLE_CREAM = REGISTRY.register(beetle("cream", 0.55f));

    public static final AutomobileFrame SHOPPING_CART = REGISTRY.register(
            new AutomobileFrame(
                    Automobility.rl("shopping_cart"),
                    0.25f,
                    new FrameModel(
                            Automobility.rl("textures/entity/automobile/frame/shopping_cart.png"),
                            Automobility.rl("frame_shopping_cart"),
                            WheelBase.basic(17, 12.05f),
                            25,
                            11,
                            7,
                            17,
                            11,
                            11
                    )
            )
    );

    public static final AutomobileFrame C_ARR = REGISTRY.register(
            new AutomobileFrame(
                    Automobility.rl("c_arr"),
                    0.85f,
                    new FrameModel(
                            Automobility.rl("textures/entity/automobile/frame/c_arr.png"),
                            Automobility.rl("frame_c_arr"),
                            WheelBase.basic(44.5f, 16),
                            44f,
                            6f,
                            19.5f,
                            10.5f,
                            23,
                            23
                    )
            )
    );

    public static final AutomobileFrame PINEAPPLE = REGISTRY.register(
            new AutomobileFrame(
                    Automobility.rl("pineapple"),
                    0.75f,
                    new FrameModel(
                            Automobility.rl("textures/entity/automobile/frame/pineapple.png"),
                            Automobility.rl("frame_pineapple"),
                            WheelBase.basic(10, 18),
                            20,
                            16,
                            8,
                            6,
                            9,
                            9
                    )
            )
    );

    private static AutomobileFrame standard(String color) {
        return new AutomobileFrame(
                Automobility.rl("standard_"+color),
                0.6f,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/standard_"+color+".png"),
                        Automobility.rl("frame_standard"),
                        WheelBase.basic(26, 10),
                        26,
                        5,
                        13,
                        3,
                        18,
                        22
                )
        );
    }

    private static AutomobileFrame motorcar(String variant, float weight) {
        return new AutomobileFrame(
                Automobility.rl(variant+"_motorcar"),
                weight,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/"+variant+"_motorcar.png"),
                        Automobility.rl("frame_motorcar"),
                        WheelBase.basic(32, 12),
                        28,
                        3,
                        18,
                        2,
                        23,
                        22
                )
        );
    }

    private static AutomobileFrame tractor(String color) {
        return new AutomobileFrame(
                Automobility.rl(color+"_tractor"),
                1f,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/"+color+"_tractor.png"),
                        Automobility.rl("frame_tractor"),
                        new WheelBase(
                                new WheelBase.WheelPos(-2, -7, 1.8f, 0, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(-2, 7, 1.8f, 180, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.RIGHT),
                                new WheelBase.WheelPos(15, -1, 1, 0, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(15, 1, 1, 180, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.RIGHT)
                        ),
                        24,
                        9,
                        9,
                        8,
                        12,
                        19
                )
        );
    }

    private static AutomobileFrame rickshaw(String prefix, float weight) {
        return new AutomobileFrame(
                Automobility.rl(prefix+"_rickshaw"),
                weight,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/"+prefix+"_rickshaw.png"),
                        Automobility.rl("frame_rickshaw"),
                        new WheelBase(
                                new WheelBase.WheelPos(-11, -7.5f, 1, 0, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(-11, 7.5f, 1, 180, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.RIGHT),
                                new WheelBase.WheelPos(11, -0.1f, 1, 0, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(11, 0.1f, 1, 180, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.RIGHT)
                        ),
                        26,
                        2.5f,
                        13,
                        3,
                        17.5f,
                        14.5f
                )
        );
    }

    private static AutomobileFrame jeep(String color) {
        return new AutomobileFrame(
                Automobility.rl("jeep_"+color),
                0.9f,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/jeep_"+color+".png"),
                        Automobility.rl("frame_jeep"),
                        new WheelBase(
                                new WheelBase.WheelPos(-12, -6.8f, 1, 0, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(-12, 6.8f, 1, 180, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.RIGHT),
                                new WheelBase.WheelPos(12, -6.8f, 1, 0, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(12, 6.8f, 1, 180, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.RIGHT)
                        ),
                        45,
                        7,
                        9,
                        2,
                        18,
                        19
                )
        );
    }

    private static AutomobileFrame beetle(String color) {
        return beetle(color, 0.65f);
    }

    private static AutomobileFrame beetle(String color, float weight) {
        return new AutomobileFrame(
                Automobility.rl("beetle_"+color),
                weight,
                new FrameModel(
                        Automobility.rl("textures/entity/automobile/frame/beetle_"+color+".png"),
                        Automobility.rl("frame_beetle"),
                        new WheelBase(
                                new WheelBase.WheelPos(-15, -9f, 1, 0, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(-15, 9f, 1, 180, WheelBase.WheelEnd.BACK, WheelBase.WheelSide.RIGHT),
                                new WheelBase.WheelPos(14.5f, -9f, 1, 0, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.LEFT),
                                new WheelBase.WheelPos(14.5f, 9f, 1, 180, WheelBase.WheelEnd.FRONT, WheelBase.WheelSide.RIGHT)
                        ),
                        45,
                        2,
                        14,
                        2,
                        23,
                        24
                )
        );
    }

    public static final DisplayStat<AutomobileFrame> STAT_WEIGHT = new DisplayStat<>("weight", AutomobileFrame::weight);

    @Override
    public boolean isEmpty() {
        return this == EMPTY;
    }

    @Override
    public ResourceLocation containerId() {
        return ID;
    }

    @Override
    public void forEachStat(Consumer<DisplayStat<AutomobileFrame>> action) {
        action.accept(STAT_WEIGHT);
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    public String getTranslationKey() {
        return "frame."+id.getNamespace()+"."+id.getPath();
    }

    public static record FrameModel(
            ResourceLocation texture,
            ResourceLocation modelId,
            WheelBase wheelBase,
            float lengthPx,
            float seatHeight,
            float enginePosBack,
            float enginePosUp,
            float rearAttachmentPos,
            float frontAttachmentPos
    ) {}
}
