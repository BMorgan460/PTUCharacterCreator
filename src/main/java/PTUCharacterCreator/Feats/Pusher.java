package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pusher extends Feature {
	{
		name = "Pusher";
		tags = "[Pokemon Caretaking Research Field] [Branch]";
		frequency = "Static";
		effect = "Your Pokemon gain the Basic Ranged Attacks, Aura Pulse, Enticing Bait, Extended Invisibility, Far Reading, Precise Threadings, Seismometer, TK Mastery, and Trail Sniffer Poke Edges automatically if they qualify for them, without having to invest any Tutor Points.";
		prereqs.put("Poke Edu", 3);
	}
	public Pusher(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",3);
	}
}