package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Noise_Complaint extends Feature {
	{
		name = "Noise Complaint";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Uproar and Hyper Voice.";
		prereqs.put("Cacophany", 0);
		prereqs.put("Charm", 5);
		prereqs.put("Focus", 5);
	}
	public Noise_Complaint(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",5) && t.checkSkillRank("Focus",5);
	}
}