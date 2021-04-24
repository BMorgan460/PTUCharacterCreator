package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Item_Mastery extends Feature {
	{
		name = "Item Mastery";
		tags = "[+Speed] [5-15 Playtest]";
		frequency = "Static";
		effect = "You learn the Moves Fling and Recycle.";
		prereqs.put("Backpacker", -1);
	}
	public Item_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Backpacker");
	}
}