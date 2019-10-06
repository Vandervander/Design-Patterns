README:
This is a part of a small revision project based around these videos by Christopher Okhravi at www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

I re-explore basic java functionality at the same time as I re-familiarise myself with design patterns (in object-oriented programming).

I doubled back to this one, and got annoyed by how the example was too abstract to be built in a satisfying way. To solve this, I thought I would make a prisoners dilemma game, where preset strategies
can be used. The problem with this idea is that a strategy might want a bunch of data I haven't thought it may need. Hopefully simply giving them access to the rounds played so far is enough.
Perhaps also specifying how many rounds are left or that there are infinite rounds left may also be pertinent.

This idea is also flawed in that only one type of strategy is implemented. As far as I have understood this pattern is overtly to solve code duplication problems without using inheritance
(because that can cause its own problems), by abstracting certain behaviours so that they can be mixed and matched to create very functionally different objects.
It's a simple idea that can be very powerful. To use a biology metaphor, the strategies are subtly different proteins in a cell, which perform the same function but behave differently.
So the problem with the prisoners dilemma game for this pattern is that the "cell" only has one function. If I would change strategies at runtime, this may even be decorator pattern???