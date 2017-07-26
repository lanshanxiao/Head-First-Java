import javax.sound.midi.*;

public class MiniMiniMusicApp{
	public static void main(String[] args){
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}
	
	public void play(){
		
		try{
			Sequencer player = MidiSystem.getSequencer();//ȡ��Sequencer�������
			player.open();                               //��������������
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);//�������,��¼����
			
			Track track = seq.createTrack();//�������ף���¼����
			
			ShortMessage a = new ShortMessage();//��������
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();//��������
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq);//��ʼ����
			
			player.start();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}