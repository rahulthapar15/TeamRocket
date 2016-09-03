# City and Team Rocket
City and Team Rocket : SNU DecaCode #1

Oldale is a city with blocks numbered 1, 2, ..., , connected with 2-way roads. Team Rocket wants to
set the entire city ablaze. For each block, there is a certain risk factor for setting that block ablaze. But
once a block is set ablaze, all blocks that can be reached from will be set ablaze immediately.
The overall risk factor of setting some number of blocks ablaze is the sum of the risk factors of setting each
of the blocks ablaze. Team rocket's goal is to set the whole city ablaze with minimal risk by picking some set
of blocks to set ablaze. Let be the minimum risk he takes when setting the entire city ablaze. Calculate
the number of ways to pick a set of blocks to obtain a risk of .

##Input Format
The first line contains an integer , the number of blocks in Oldale.
The second line contains space-separated integers, the i-th integer representing . (1-based index)
The third line contains an integer , denoting the number 2-way roads.
Each of the next lines contains two space-separated integers , denoting road between blocks.

##Constraints
####1 <= N <= 10^3 
####1 <=K <= 10^3 
####1 <=E[i] <= 10^3 

##Output Format
Output one integer, W. The number of ways to pick a set of blocks to obtain a risk of M, so that the entire
city is set ablaze is U. is the remainder when U is divided by 10^9 + 7= 1000000007.
