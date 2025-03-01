 package cn.magicst.mamiyaotaru.voxelmap.gui.overridden;
 
 import cn.magicst.mamiyaotaru.voxelmap.interfaces.ISettingsManager;
 import net.minecraft.class_2561;
 import net.minecraft.class_2585;
 import net.minecraft.class_357;
 
 public class GuiOptionSliderMinimap extends class_357 {
   private final ISettingsManager options;
   
   public GuiOptionSliderMinimap(int x, int y, EnumOptionsMinimap optionIn, float sliderValue, ISettingsManager options) {
     super(x, y, 150, 20, (class_2561)new class_2585(options.getKeyText(optionIn)), sliderValue);
     this.options = options;
     this.option = optionIn;
   }
   private final EnumOptionsMinimap option;
   protected void method_25346() {
     method_25355((class_2561)new class_2585(this.options.getKeyText(this.option)));
   }
   
   protected void method_25344() {
     this.options.setOptionFloatValue(this.option, (float)this.field_22753);
   }
   
   public EnumOptionsMinimap returnEnumOptions() {
     return this.option;
   }
   
   public void setValue(float value) {
     if (!method_25367()) {
       this.field_22753 = value;
       method_25346();
     } 
   }
 }

