package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Messiah extends Feature {
	{
		name = "Messiah";
		tags = "[Patron Stat]";
		frequency = "One Time Use/5";
		effect = "Your Connection with one of your Patrons has reached such a point that even you are capable of performing the miracles they are renowned and worshiped for. Expending a use of Messiah allows you to perform such a miracle. For example, in a region where Shaymin is known to restore withered forests to their former glory, a Touched who is a Messiah of Shaymin might be able to cause a forest to start to rapidly recover from the aftermath of a wildfire. Such acts are usually, but not always, noticeably supernatural and divine.";
		prereqs.put("Touched", -3);
		prereqs.put("GM Permission", 0);
	}
	public Messiah(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Touched");
	}
}