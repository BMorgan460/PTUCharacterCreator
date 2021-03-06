package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Type_Sync extends Feature {
	{
		name = "Type Sync";
		tags = "";
		frequency = "Static";
		effect = "The Target gains the Type of your Elemental Connection as an additional Type, or has one of their Types replaced by that Type. See the Type Changes section (page 436) for more information and suggestions. A Pokemon may be targeted by Type Sync only once. This Feature may be performed One Time for each Rank above Untrained you have of your highest of Medicine, Occult, or Tech Education, up to a maximum of 4 times at Master Rank.  *Type-Linked Classes include Type Ace and all Elementalist Classes, all of which are linked to their respective Types. Additionally, Aura Guardian is linked to Fighting, and Telekinetic, Telepath, and Warper are linked to Psychic. Obviously, your Type Linked Class must match your Elemental Connection to apply for Type Sync!";
		prereqs.put("Elemental Connection", -3);
		prereqs.put("a Type-Linked Class*", 0);
		prereqs.put("Adept Medicine", 0);
		prereqs.put("Occult", 0);
		prereqs.put("or Tech Education.", 0);
	}
	public Type_Sync(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Elemental Connection");
	}
}