package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Beguiling_Dance extends Feature {
	{
		name = "Beguiling Dance";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "When creating Dance Moves, you can choose to create a Dance Move that has Range: 4, 1 Target, AC 3, and lowers a Combat Stat (chosen at creation) by -2 Combat Stages. This Move is otherwise the same as other Dance Moves you could create except that Dance Moves created with this template have the Contest Effect Excitement instead of Get Ready!.";
		prereqs.put("Dance Form", -1);
	}
	public Beguiling_Dance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dance Form");
	}
}