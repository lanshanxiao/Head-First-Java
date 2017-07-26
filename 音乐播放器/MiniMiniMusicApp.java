import javax.sound.midi.*;

public class MiniMiniMusicApp{
	public static void main(String[] args){
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}
	
	public void play(){
		
		try{
			Sequencer player = MidiSystem.getSequencer();//取得Sequencer并将其打开
			player.open();                               //创建播放器并打开
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);//创建光碟,记录乐谱
			
			Track track = seq.createTrack();//创建乐谱，记录音符
			
			ShortMessage a = new ShortMessage();//制作音符
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();//制作音符
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq);//开始播放
			
			player.start();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}