import javax.sound.midi.*;//引入Sequencer

public class MusicTest1{
	
	public void play(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();//这个对象用来将MIDI信息组合成“乐曲”
			System.out.println("We got a sequencer");
		}catch(MidiUnavailableException ex){
			System.out.println("Bummer");
		}
	}
	
	public static void main(String[] args){
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}