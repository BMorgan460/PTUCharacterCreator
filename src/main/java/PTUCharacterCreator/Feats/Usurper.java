package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Usurper extends Feature {
	{
		name = "Usurper";
		tags = "[Patron Stat]";
		frequency = "Static";
		effect = "Your human form is now considered your Avatar, and you gain a second set of stats for your Pokemon form. This form is that of the Legendary you usurped, starts at level 1 with the nature and abilities of your choice, and may gain experience as if it were a Pokemon you owned. Switching between your human form and this one takes a Standard Action. Usurpers cannot receive Gifts or Blessings from other Legendaries, as they are divinity themselves now. Any Touched, Branded, Messiah, and Signer Edges and Features you possessed up until this point are refunded. The Patron Stats for this Feature and all other Usurper Features matches the stats of the Legendary you Usurped.";
		prereqs.put("You have slain a God and through occult ritual or technology have absorbed its essence.", 0);
	}
	public Usurper(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}