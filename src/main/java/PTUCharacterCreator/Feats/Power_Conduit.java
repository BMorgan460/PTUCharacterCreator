package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Power_Conduit extends Feature {
	{
		name = "Power Conduit";
		tags = "";
		frequency = "2 AP - Swift Action";
		effect = "Target: Channeled Pokemon  Choose One Effect: »» Trade all Combat Stages for a single Stat between two Channeled Pokemon »» Transfer a Coat from one Channeled Pokemon to another. »» Give up a use of Scene or Daily Move from one willing Channeled Pokemon to regain use of a Scene Move which another Channeled Pokemon has used. This effect may only refresh a Move for each Pokemon once per Scene.";
		prereqs.put("Channeler", -1);
		prereqs.put("Intuition", 4);
	}
	public Power_Conduit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Channeler") && t.checkSkillRank("Intuition",4);
	}
}