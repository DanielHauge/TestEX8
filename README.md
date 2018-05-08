# Test Exercise 8 (BDD with cucumber + Profiling and Pairwise testing)
This repository is a exercise project for Software development (PBA) Test course. Daniel (cph-dh136)

## Description
This exercise is to get familiar with how to do testing with cucumber, do profilling and setup tests with pariwise testing as to not create to many tests that testing takes to long time to run. The assignment is based on this ressource [Here](https://github.com/datsoftlyngby/soft2018spring-test-teaching-material/blob/master/slides/Cucumber.pdf)

## Assignment / Notes
The first apperent thing i learned by examining cucumber, is that we can automate acceptence tests. Writing acceptence criteria with the gherkin format, we can use cucumber to "Translate"/"Fetch" that acceptence criteria with regex and create a test with it. We could also "test" the acceptence criteria by talking it over with the customer. ie. The customer specifies the requirements which can be done with examples of how the system should work. These examples can be made into acceptence criteria and then with the gherkin format into automated tests. The use of gerkin format to make behaivor driven development sytnax, the none programmers can communicate in a way that's familiar to them, which also is clear in it's requirements to the programmer, that with cucumber can implement the very requirements into a testing enviroment with very little overhead.

As for profilling, i learned that JMeter in particular is very generic and broad system. It is very complicated to setup correctly and work with. NetBeans has profilling built in, but NetBeans in general is over complicating alot of things. I will not be using JMeter or NetBeans again as i think the profit from working with it, is so niche. Still profilling in general is very niche, to know exactly how many objects is passed around / Created and so fourth, and how long it takes for each method call and so on is still very niche for many applications. However when the time comes that a application with very time and space sensitivity requirements comes, i will definitly look towards a powerfull profilling tool, such as JMeter or Gatling. But for the time being, i think for most applications using profilling as powerful as JMeter or Gatling is like shooting flies with misiles. Another approach which can be used, is to just benchmark for time. eg. 


    start := System.currentMillis();
    // Some code - Method or anything
    end := System.currentMillis();
    Duration := end - start;
    assertTrue(Duration < TimeThreadshold);

In many situations, this is just fine in my opinion. Maybe it also comes down to the language, java is a very "messy" language where there is no de facto standard way of doing anything. A good example would be golang, which has standard benchmarking profilling built into the language. See [Benchmarking_test.go](https://github.com/DanielHauge/DSAL2/blob/master/Benchmarking_test.go)

    
    goos: windows
    goarch: amd64
    500000000	 3.87 ns/op			// If-else long
    2000000000	 1.11 ns/op			// If-else small
    100000000	22.9 ns/op 			// Array
    1000000	  1172 ns/op   			// Tree
    PASS
    ok  	_/C_/Users/Animc/Desktop/Repos/DSAL2	8.136s

See Snapshots for java example in the nps files in the repository.

For pairwise testing, i've used TestPairs. Which i can see a big advantage of doing. I've used threewise so it kind of eliminated the need for it, since it generated all possible combinations anyways. But i see an advantage in using TestPair to generate mostly relevant test cases for a combination of inputs, without blowing up test cases to much.

[TestPairs Input]()

[TestPairs Output]()