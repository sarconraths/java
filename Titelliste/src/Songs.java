
public class Songs {
	public int SongId; 
	public String SongTitel; 
	public int InterpId;
	
	public Songs() {
		
	}
	public Songs (int id, String sn, int intId){
		setSongId(id);
		setSongName(sn);
		setIntId(intId);
	}
	
	public void setSongId(int id) {
		SongId = id; 		
	}
	public int getSongId() {
		return SongId; 
	}
	public void setSongName(String sn) {
		SongTitel = sn; 
	}
	public String getSongName() {
		return SongTitel; 
	}
	public void setIntId(int intId) {
		InterpId = intId;
	}
	public int getIntId() {
		return InterpId; 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.SongId + ", " + this.SongTitel + ", " + this.InterpId;
	}
}
