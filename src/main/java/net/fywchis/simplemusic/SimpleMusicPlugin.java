package net.fywchis.simplemusic;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.events.EventRegistration;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;

public class SimpleMusicPlugin implements VoicechatPlugin {
    public static VoicechatApi voicechatApi;
    public static VoicechatServerApi voicechatServerApi;

    @Override
    public String getPluginId() {
        return SimpleMusic.MODID;
    }

    @Override
    public void initialize(VoicechatApi api) {voicechatApi = api;}

    @Override
    public void registerEvents(EventRegistration registration) {
        registration.registerEvent(VoicechatServerStartedEvent.class, this::serverStart);
    }

    private void serverStart(VoicechatServerStartedEvent event) {
        voicechatServerApi = event.getVoicechat();
    }

}
