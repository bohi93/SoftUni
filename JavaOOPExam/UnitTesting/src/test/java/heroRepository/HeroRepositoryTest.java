package heroRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HeroRepositoryTest {
    private HeroRepository heroRepository;
    private static final Item ITEM_AGILITY = new Item(5,10,5);
    private static final Item ITEM_STR = new Item(10,5,5);
    private static final Item ITEM_INT = new Item(5,5,10);
    private static final Hero HERO_AGILITY = new Hero("Gosho",3,ITEM_AGILITY);
    private static final Hero HERO_STRENGTH = new Hero("Gosho1",3,ITEM_STR);
    private static final Hero HERO_INT = new Hero("Gosho2",3,ITEM_INT);
    private static final Hero HERO_TO_REMOVE = new Hero("Test",3,new Item(5,15,5));
    private static final String HERO_NOT_ADDED = "fret";
    private static final String HERO_ADDED = "Test";
    private static final int HERO_COUNT = 2;

    @Before
    public void beforeEach(){
        heroRepository = new HeroRepository();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addShouldThrowIfHeroIsDuplicate() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_AGILITY);
    }

    @Test
    public void addShouldAddHero() {
        heroRepository.add(HERO_AGILITY);
        Assert.assertEquals("Add does not add Hero to Repository.",heroRepository.getHeroWithHighestAgility(),HERO_AGILITY);
    }

    @Test(expected = NullPointerException.class)
    public void removeShouldThrowIfHeroIsNotInRepository() {
        heroRepository.remove(HERO_NOT_ADDED);
    }

    @Test
    public void removeShouldRemoveHeroFromRepository() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_TO_REMOVE);
        heroRepository.remove(HERO_ADDED);
        Assert.assertEquals("Remove does not removes the hero.",heroRepository.getHeroWithHighestAgility(),HERO_AGILITY);
    }


    @Test
    public void getHeroWithHighestStrengthShouldReturnHeroWithHighestStrength() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_STRENGTH);
        heroRepository.add(HERO_INT);
        Assert.assertEquals("getHeroWithHighestStrength does not show Hero with most Strength.",heroRepository.getHeroWithHighestStrength(),HERO_STRENGTH);
    }

    @Test(expected = NullPointerException.class)
    public void getHeroWithHighestStrengthShouldThrowIfNoHero() {
        heroRepository.getHeroWithHighestStrength();
    }

    @Test
    public void getHeroWithHighestAgilityShouldReturnHeroHeroWithHighestAgility() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_STRENGTH);
        heroRepository.add(HERO_INT);
        Assert.assertEquals("getHeroWithHighestAgility does not show Hero with most Agility.",heroRepository.getHeroWithHighestAgility(),HERO_AGILITY);
    }

    @Test(expected = NullPointerException.class)
    public void getHeroWithHighestAgilityShouldShouldThrowIfNoHero() {
        heroRepository.getHeroWithHighestAgility();
    }

    @Test
    public void getHeroWithHighestIntelligenceShouldReturnHeroHeroWithHighestIntelligence() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_STRENGTH);
        heroRepository.add(HERO_INT);
        Assert.assertEquals("getHeroWithHighestIntelligence does not show Hero with most Intelligence.",heroRepository.getHeroWithHighestIntelligence(),HERO_INT);
    }

    @Test(expected = NullPointerException.class)
    public void getHeroWithHighestIntelligenceShouldThrowIfNoHero() {
        heroRepository.getHeroWithHighestIntelligence();
    }

    @Test
    public void getCountShouldReturnActualCount() {
        heroRepository.add(HERO_AGILITY);
        heroRepository.add(HERO_TO_REMOVE);
        Assert.assertEquals("getCount does not show actual count",heroRepository.getCount(),HERO_COUNT);
    }
    
    @Test
    public void getCountShouldReturnZeroIfEmpty() {
        Assert.assertEquals("getCount does not show actual count",heroRepository.getCount(),0);
    }

    @Test
    public void toStringShouldReturnString() {
        heroRepository.add(HERO_AGILITY);
        Assert.assertEquals("",heroRepository.toString(),HERO_AGILITY.toString());
    }
}