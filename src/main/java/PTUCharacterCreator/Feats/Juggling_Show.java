package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Juggling_Show extends Feature {
	{
		name = "Juggling Show";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You may roll an additional Xd6 during the Introduction Stage of a Contest, where X is half of your Acrobatics Rank. You may choose any Contest Stat to attempt to gain Dice for with this roll.";
		prereqs.put("Juggler", -1);
	}
	public Juggling_Show(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Juggler");
	}
}