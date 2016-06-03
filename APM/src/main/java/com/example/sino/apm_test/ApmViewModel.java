package com.example.sino.apm_test;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by sino on 2016-05-30.
 */
public class ApmViewModel extends BaseObservable {

    private MainActivity activity;
    public ApmViewModel(MainActivity activity){ this.activity = activity;}


    private String targetIP = "127.0.0.1";
    @Bindable
    public String getTargetIP(){
        return targetIP;
    }
    public void setTargetIP(String targetIP){
        this.targetIP = targetIP;
        notifyPropertyChanged(BR.targetIP);
    }

    private boolean highPassFilter = false;
    @Bindable
    public boolean getHighPassFilter(){
        return highPassFilter;
    }
    public void setHighPassFilter(boolean highPassFilter){
        this.highPassFilter = highPassFilter;
        notifyPropertyChanged(BR.highPassFilter);
    }


    private boolean speechIntelligibilityEnhance = false;
    @Bindable
    public boolean getSpeechIntelligibilityEnhance(){
        return speechIntelligibilityEnhance;
    }
    public void setSpeechIntelligibilityEnhance(boolean speechIntelligibilityEnhance){
        this.speechIntelligibilityEnhance = speechIntelligibilityEnhance;
        notifyPropertyChanged(BR.speechIntelligibilityEnhance);
    }

    private boolean beamForming = false;
    @Bindable
    public boolean getBeamForming() {
        return beamForming;
    }
    public void setBeamForming(boolean beamForming){
        this.beamForming = beamForming;
        notifyPropertyChanged(BR.beamForming);
    }

    private boolean aecPC = true;
    @Bindable
    public boolean getAecPC(){
        return aecPC;
    }
    public void setAecPC(boolean aecPC){
        this.aecPC = aecPC;
        notifyPropertyChanged(BR.aecPC);
    }

    private boolean aecMobile = false;
    @Bindable
    public boolean getAecMobile(){
        return  aecMobile;
    }
    public void setAecMobile(boolean aecMobile){
        this.aecMobile = aecMobile;
        notifyPropertyChanged(BR.aecMobile);
    }

    private boolean aecNone = false;
    @Bindable
    public boolean getAecNone(){
        return aecNone;
    }
    public void setAecNone(boolean aecNone){
        this.aecNone = aecNone;
        notifyPropertyChanged(BR.aecNone);
    }

    private boolean aecExtendFilter = false;
    @Bindable
    public boolean getAecExtendFilter(){
        return aecExtendFilter;
    }
    public void setAecExtendFilter(boolean aecExtendFilter){
        this.aecExtendFilter = aecExtendFilter;
        notifyPropertyChanged(BR.aecExtendFilter);
    }

    private boolean delayAgnostic = true;
    @Bindable
    public boolean getDelayAgnostic(){
        return delayAgnostic;
    }
    public void setDelayAgnostic(boolean delayAgnostic){
        this.delayAgnostic = delayAgnostic;
        notifyPropertyChanged(BR.delayAgnostic);
    }

    private boolean nextGenerationAEC = false;
    @Bindable
    public boolean getNextGenerationAEC(){
        return nextGenerationAEC;
    }
    public void setNextGenerationAEC(boolean nextGenerationAEC){
        this.nextGenerationAEC = nextGenerationAEC;
        notifyPropertyChanged(BR.nextGenerationAEC);
    }

    private String bufferDelay = "150";
    @Bindable
    public String getBufferDelay() {
        return bufferDelay;
    }
    public void setBufferDelay(String bufferDelay){
        this.bufferDelay = bufferDelay;
        notifyPropertyChanged(BR.bufferDelay);
    }
    public short getBufferDelayMs(){
        try{
            return (short) Integer.parseInt(bufferDelay);
        }catch (Exception e){
            return 150;
        }
    }


    private boolean aecPCMode0 = false;
    private boolean aecPCMode1 = false;
    private boolean aecPCMode2 = true;
    @Bindable
    public boolean getAecPCMode0(){
        return aecPCMode0;
    }
    public void setAecPCMode0(boolean aecMode){
        this.aecPCMode0 = aecMode;
        notifyPropertyChanged(BR.aecPCMode0);
    }

    @Bindable
    public boolean getAecPCMode1(){
        return aecPCMode1;
    }
    public void setAecPCMode1(boolean aecMode){
        this.aecPCMode1 = aecMode;
        notifyPropertyChanged(BR.aecPCMode1);
    }

    @Bindable
    public boolean getAecPCMode2(){
        return aecPCMode2;
    }
    public void setAecPCMode2(boolean aecMode){
        this.aecPCMode2 = aecMode;
        notifyPropertyChanged(BR.aecPCMode2);
    }

    private boolean aecMobileMode0 = false;
    private boolean aecMobileMode1 = false;
    private boolean aecMobileMode2 = false;
    private boolean aecMobileMode3 = true;
    private boolean aecMobileMode4 = false;
    @Bindable
    public boolean getAecMobileMode0(){
        return aecPCMode0;
    }
    public void setAecMobileMode0(boolean aecMode){
        this.aecMobileMode0 = aecMode;
        notifyPropertyChanged(BR.aecMobileMode0);
    }

    @Bindable
    public boolean getAecMobileMode1(){
        return aecMobileMode1;
    }
    public void setAecMobileMode1(boolean aecMode){
        this.aecMobileMode1 = aecMode;
        notifyPropertyChanged(BR.aecMobileMode1);
    }

    @Bindable
    public boolean getAecMobileMode2(){
        return aecMobileMode2;
    }
    public void setAecMobileMode2(boolean aecMode){
        this.aecMobileMode2 = aecMode;
        notifyPropertyChanged(BR.aecMobileMode2);
    }

    @Bindable
    public boolean getAecMobileMode3(){
        return aecMobileMode3;
    }
    public void setAecMobileMode3(boolean aecMode){
        this.aecMobileMode3 = aecMode;
        notifyPropertyChanged(BR.aecMobileMode3);
    }

    @Bindable
    public boolean getAecMobileMode4(){
        return aecMobileMode4;
    }
    public void setAecMobileMode4(boolean aecMode){
        this.aecMobileMode4 = aecMode;
        notifyPropertyChanged(BR.aecMobileMode4);
    }


    private boolean ns = false;
    @Bindable
    public boolean getNs(){
        return ns;
    }
    public void setNs(boolean ns){
        this.ns = ns;
        notifyPropertyChanged(BR.ns);
    }

    private boolean experimentalNS = false;
    @Bindable
    public boolean getExperimentalNS(){
        return experimentalNS;
    }
    public void setExperimentalNS(boolean experimentalNS){
        this.experimentalNS = experimentalNS;
        notifyPropertyChanged(BR.experimentalNS);
    }


    private boolean nsMode0 = false;
    private boolean nsMode1 = false;
    private boolean nsMode2 = true;
    private boolean nsMode3 = false;
    @Bindable
    public boolean getNsMode0(){
        return nsMode0;
    }
    public void setNsMode0(boolean nsMode0){
        this.nsMode0 = nsMode0;
        notifyPropertyChanged(BR.nsMode0);
    }

    @Bindable
    public boolean getNsMode1(){
        return nsMode1;
    }
    public void setNsMode1(boolean nsMode1){
        this.nsMode1 = nsMode1;
        notifyPropertyChanged(BR.nsMode1);
    }

    @Bindable
    public boolean getNsMode2(){
        return nsMode2;
    }
    public void setNsMode2(boolean nsMode2){
        this.nsMode2 = nsMode2;
        notifyPropertyChanged(BR.nsMode2);
    }

    @Bindable
    public boolean getNsMode3(){
        return nsMode3;
    }
    public void setNsMode3(boolean nsMode3){
        this.nsMode3 = nsMode3;
        notifyPropertyChanged(BR.nsMode3);
    }


    private boolean agc = false;
    @Bindable
    public boolean getAgc(){
        return agc;
    }
    public void setAgc(boolean agc){
        this.agc = agc;
        notifyPropertyChanged(BR.agc);
    }


    private boolean experimentalAGC = false;
    @Bindable
    public boolean getExperimentalAGC(){
        return experimentalAGC;
    }
    public void setExperimentalAGC(boolean experimentalAGC){
        this.experimentalAGC = experimentalAGC;
        notifyPropertyChanged(BR.experimentalAGC);
    }

    private boolean agcMode0 = false;
    private boolean agcMode1 = false;
    private boolean agcMode2 = true;
    @Bindable
    public boolean getAgcMode1(){
        return agcMode1;
    }
    public void setAgcMode1(boolean agcMode1){
        this.agcMode1 = agcMode1;
        notifyPropertyChanged(BR.agcMode1);
    }

    @Bindable
    public boolean getAgcMode2(){
        return agcMode2;
    }
    public void setAgcMode2(boolean agcMode2){
        this.agcMode2 = agcMode2;
        notifyPropertyChanged(BR.agcMode2);
    }

    @Bindable
    public boolean getAgcMode0(){
        return agcMode0;
    }
    public void setAgcMode0(boolean agcMode0){
        this.agcMode0 = agcMode0;
        notifyPropertyChanged(BR.agcMode0);
    }


    private String targetLevel = "6";
    @Bindable
    public String getTargetLevel(){
        return targetLevel;
    }
    public void setTargetLevel(String level){
        try{
            targetLevelInt = (short) Integer.parseInt(level);
            if(targetLevelInt > 31) targetLevelInt = 31;
            if(targetLevelInt < 0) targetLevelInt = 0;
            this.targetLevel = targetLevelInt + "";
            notifyPropertyChanged(BR.targetLevel);
        }catch (Exception e){
        }
    }

    private int targetLevelInt = 6;
    public int getTargetLevelInt(){
        return targetLevelInt;
    }


    private String compressionGain = "9";
    @Bindable
    public String getCompressionGain(){return compressionGain;}
    public void setCompressionGain(String gain){
        try{
            compressionGainInt = (short) Integer.parseInt(gain);
            if(compressionGainInt > 90) compressionGainInt = 90;
            if(compressionGainInt < 0) compressionGainInt = 0;
            this.compressionGain = compressionGainInt + "";
            notifyPropertyChanged(BR.compressionGain);
        }catch (Exception e){
        }
    }

    private int compressionGainInt = 9;
    public int getCompressionGainInt(){
        return compressionGainInt;
    }


    private boolean vad = false;
    @Bindable
    public boolean getVad(){
        return vad;
    }

    public void setVad(boolean vad){
        this.vad = vad;
        notifyPropertyChanged(BR.vad);
    }


    private int rcvCount = 0;
    @Bindable
    public String getRcvCount(){
        return rcvCount+"";
    }
    public void setRcvCount(int rcvCount){
        this.rcvCount = rcvCount;
        notifyPropertyChanged(BR.rcvCount);
    }

    private int sndCount = 0;
    @Bindable
    public String getSndCount() {
        return sndCount+"";
    }
    public void setSndCount(int count){
        this.sndCount = count;
        notifyPropertyChanged(BR.sndCount);
    }


    private boolean start = false;
    @Bindable
    public boolean getStart(){
        return start;
    }


    public void onSpeaker(View view){
        boolean on = ((CheckBox)view).isChecked();
        activity.onSpeaker(on);
    }

    public void setStart(boolean start){
        this.start = start;
        notifyPropertyChanged(BR.start);
    }


    public void onStart(View view){
        activity.Start();
    }
}
