package com.mycompany.ch08;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name = "ansdf";

//	추상메서드
	public abstract void turnOn();
	void TurnOff();
	void setVolume(int volume);
	
//	default : 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
//	static : 정밀 메서드
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	
}