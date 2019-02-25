package cordova.plugin.deezer;

import org.apache.cordova.CallbackContext;

public interface DeezerJSListener {
    
    void init(CallbackContext callbackContext, String appId);
    
    void login(CallbackContext callbackContext);
    
    void onPlayTracks(CallbackContext callbackContext, String ids, int index,
                      int offset, boolean autoPlay, boolean addToQueue);
    
    void onPlayAlbum(CallbackContext callbackContext, String id, int index,
                     int offset, boolean autoPlay, boolean addToQueue);
    
    void onPlayPlaylist(CallbackContext callbackContext, String id, int index,
                        int offset, boolean autoPlay, boolean addToQueue);
    
    void onPlayRadio(CallbackContext callbackContext, String id, int index,
                     int offset, boolean autoPlay, boolean addToQueue);
    
    void onPlayArtistRadio(CallbackContext callbackContext, String id,
                           int index, int offset, boolean autoPlay, boolean addToQueue);
    
    void onPlay(CallbackContext callbackContext);
    
    void onPause(CallbackContext callbackContext);
    
    void onNext(CallbackContext callbackContext);
    
    void onPrev(CallbackContext callbackContext);
    
    void setChangePosition(long idxPos);

    void setChangePositionTo(long idxPos);
    
    boolean setVolume(float val1, float val2);

    void getToken(CallbackContext callbackContext);

    void setAuthInfo(CallbackContext callbackContext, String token, String userId, String userString);

    void getAlbums(CallbackContext callbackContext);

    void getTracksByAlbum(CallbackContext callbackContext, long albumId, long offset);

    void getPlaylists(CallbackContext callbackContext);

    void getTracksByPlaylist(CallbackContext callbackContext, long playlistId, long offset);
    
    void getRadios(CallbackContext callbackContext);

    void getTracksByRadios(CallbackContext callbackContext, long radioId, long offset);

    void getFlow(CallbackContext callbackContext);
}
