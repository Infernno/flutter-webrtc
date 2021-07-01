package com.cloudwebrtc.webrtc.utils;

import java.util.Set;

/** Selected audio device change event. */
public interface AudioManagerEvents {
    // Callback fired once audio device is changed or list of available audio devices changed.
    void onAudioDeviceChanged(
            RTCAudioManager.AudioDevice selectedAudioDevice, Set<RTCAudioManager.AudioDevice> availableAudioDevices);
}