
public class generatePokemon {
	
	private String name;
	private String nature;
	private String ability;
	private String gender;
	private int baseAtk;
	private int baseSpatk;
	private int baseSpd;
	private int baseSpdef;
	private int baseDef;
	private int baseHP;
	private int atkIV;
	private int spatkIV;
	private int spdIV;
	private int spdefIV;
	private int defIV;
	private int hpIV;
	
	
	public generatePokemon(String name, String nature, String ability, String gender, 
			int baseAtk, int baseSpatk, int baseSpd, int baseDef, int baseSpdef, int baseHP, 
			int atkIV, int defIV, int spdIV, int spdefIV, int spatkIV, int hpIV) {
		
		
	}

	public void generateGender(int genderRateM, int genderRateF)
	{
		if(genderRateM == 0 && genderRateF == 0)
		{
			gender = "genderless";
		}
		
		else
		{
			if(genderRateM == 0)
			{
				gender = "Female";
			}
			else if(genderRateF == 0)
			{
				gender = "Male";
			}
			else
			{
				int generate = (int)(Math.random()*100 + 1);
				if(generate <= genderRateM)
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}
			}
		}
	}
	
	public void generateStats(int level) {
	}
	
	
	
	public void generateIVs() {
		atkIV = (int)(Math.random()*31 + 1);
		spatkIV = (int)(Math.random()*31 + 1);
		spdIV = (int)(Math.random()*31 + 1);
		defIV = (int)(Math.random()*31 + 1);
		spdefIV = (int)(Math.random()*31 + 1);
		hpIV = (int)(Math.random()*31 + 1);
		
	}
	
	public void generateNature() {
		
	int natureVal = (int)(Math.random()*25 + 1);
	
	if (natureVal == 1)
	nature.equalsIgnoreCase("HARDY");
	else if (natureVal == 2)
	nature.equalsIgnoreCase("LONLEY");
	else if (natureVal == 3)
	nature.equalsIgnoreCase("BRAVE");
	else if (natureVal == 4)
	nature.equalsIgnoreCase("ADAMENT");
	else if (natureVal == 5)
	nature.equalsIgnoreCase("NAUGHTY");
	else if (natureVal == 6)
	nature.equalsIgnoreCase("BOLD");
	else if (natureVal == 7)
	nature.equalsIgnoreCase("DOCILE");
	else if (natureVal == 8)
	nature.equalsIgnoreCase("RELAXED");
	else if (natureVal == 9)
	nature.equalsIgnoreCase("IMPISH");
	else if (natureVal == 10)
	nature.equalsIgnoreCase("LAX");
	else if (natureVal == 11)
	nature.equalsIgnoreCase("TIMID");
	else if (natureVal == 12)
	nature.equalsIgnoreCase("HASTY");
	else if (natureVal == 13)
	nature.equalsIgnoreCase("SERIOUS");
	else if (natureVal == 14)
	nature.equalsIgnoreCase("JOLLY");
	else if (natureVal == 15)
	nature.equalsIgnoreCase("NAIVE");
	else if (natureVal == 16)
	nature.equalsIgnoreCase("MODEST");
	else if (natureVal == 17)
	nature.equalsIgnoreCase("MILD");
	else if (natureVal == 18)
	nature.equalsIgnoreCase("QUIET");
	else if (natureVal == 19)
	nature.equalsIgnoreCase("BASHFUL");
	else if (natureVal == 20) 
	nature.equalsIgnoreCase("RASH");
	else if (natureVal == 21) 
	nature.equalsIgnoreCase("CALM");
	else if (natureVal == 22) 
	nature.equalsIgnoreCase("GENTLE");
	else if (natureVal == 23) 
	nature.equalsIgnoreCase("SASSY");
	else if (natureVal == 24) 
	nature.equalsIgnoreCase("CAREFUL");
	else if (natureVal == 25) 
	nature.equalsIgnoreCase("QUIRKY");
	}
	
	

}
