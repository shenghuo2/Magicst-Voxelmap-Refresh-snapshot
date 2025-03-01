 package cn.magicst.mamiyaotaru.voxelmap.fabricmod.mixins;
 
 import cn.magicst.mamiyaotaru.voxelmap.fabricmod.FabricModVoxelMap;
 import java.util.UUID;
 import net.minecraft.class_2556;
 import net.minecraft.class_2561;
 import net.minecraft.class_335;
 import org.spongepowered.asm.mixin.Mixin;
 import org.spongepowered.asm.mixin.injection.At;
 import org.spongepowered.asm.mixin.injection.Inject;
 import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
 
 @Mixin({class_335.class})
 public class APIMixinChatListenerHud
 {
   @Inject(method = {"onChatMessage(Lnet/minecraft/network/MessageType;Lnet/minecraft/text/Text;Ljava/util/UUID;)V"}, at = {@At("HEAD")}, cancellable = true)
   public void postSay(class_2556 type, class_2561 textComponent, UUID uuid, CallbackInfo ci) {
     if (!FabricModVoxelMap.instance.onChat(textComponent))
       ci.cancel(); 
   }
 }

