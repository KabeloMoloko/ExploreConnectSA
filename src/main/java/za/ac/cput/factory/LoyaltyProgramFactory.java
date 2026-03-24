package za.ac.cput.factory;

import za.ac.cput.domain.LoyaltyProgram;
import za.ac.cput.util.Helper;

import java.time.LocalDateTime;
import java.util.List;

public class LoyaltyProgramFactory {
    //Accepts parameters needed to build the object.
    public static LoyaltyProgram createLoyaltyProgram(int points,
                                                               String tier,
                                                               LocalDateTime joinDate,
                                                               List<String> rewards) {


    //calls for validation for points and rewards
        if (!(LoyaltyProgramFactory.createLoyaltyProgram(points) ||
                !LoyaltyProgramFactory.createLoyaltyProgram(rewards)))

        {
            Helper.requireNotEmptyOrNull(tier, "tier");
            Helper.requireNotEmptyOrNull(rewards, "rewards");
            Helper.requireNonNull(joinDate, "joinDate");

    // creates new builder object to construct Loyalty Program
            return new LoyaltyProgram.Builder(points, tier, joinDate, rewards)
                    .setPoints(points)
                    .setTier(tier)
                    .setJoinDate(joinDate)
                    .setRewards(rewards)
                    .build();
        } else {
    return null;
}
    }
    private static boolean createLoyaltyProgram(List<String> rewards) {
        return rewards != null;
    }
    private static boolean createLoyaltyProgram(int points) {
        return points >= 0;
    }
}


