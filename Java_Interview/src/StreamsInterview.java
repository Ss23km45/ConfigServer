import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamsInterview {
 class City {
		String location;
		String city;
		public City(String location, String city) {
			super();
			this.location = location;
			this.city = city;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		
		
	}

	public static void main(String...strings ) {
		System.out.println("%%%%%%%%%%%%%%%%%%%%EVEN NUMBERS%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		//find out all even numbers
		list.stream().filter(a -> a%2==0).forEach(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%STARTS WITH 1%%%%%%%%%%%%%%%%%%%%%%%");
		//Find all numbers starting with one
		list.stream().map(a -> Integer.toString(a)).filter(b -> b.startsWith("1"))
					 .forEach(System.out::println);	
		
		System.out.println("%%%%%%%%%%%%%%%%%%%DUPLICATE ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> duplicate = Arrays.asList(10,15,8,49,25,98,98,32,15);
		duplicate.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.entrySet().stream().filter(a -> a.getValue() > 1).map(b -> b.getKey()).forEach(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%NON DUPLICATE ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> nonDuplicate = Arrays.asList(10,15,8,49,25,98,98,32,15);
		nonDuplicate.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.entrySet().stream().filter(a -> a.getValue() == 1).map(b -> b.getKey()).forEach(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%FIND FIRST ELEMENT%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> findFirst = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int val = findFirst.stream().findFirst().get();
		findFirst.stream().findFirst().ifPresent(System.out::println);
		System.out.println("First Element " + val);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%TOTAL NUMBER OF ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> totalEle = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Long total = totalEle.stream().count();
		System.out.println("Total Elements " + total);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%MAXIMUM VALUE IN ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> maxValu = Arrays.asList(10,15,8,49,25,98,98,32,15);
		maxValu.stream().max((a,b) -> a -b ).ifPresent(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%MINIMuM VALUE IN ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> minVal = Arrays.asList(10,15,8,49,25,98,98,32,15);
		minVal.stream().max((a,b) -> a -b ).ifPresent(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%NON REPEATED FIRST CHARACTER%%%%%%%%%%%%%%%%%%%%%%%%");
		String input = "Java articles are Awesome";
		char c = input.chars().mapToObj(a -> Character.toLowerCase(Character.valueOf((char) a)))
								.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
								.entrySet().stream().filter(a -> a.getValue()==1).map(b -> b.getKey()).findFirst().get();
		System.out.println("First non repeating char :: " + c);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%REPEATED FIRST CHARACTER%%%%%%%%%%%%%%%%%%%%%%%%");
		String input2 = "Java articles are Awesome";
		char c1 = input2.chars().mapToObj(a -> Character.toLowerCase(Character.valueOf((char) a)))
								.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
								.entrySet().stream().filter(a -> a.getValue()>1).map(b -> b.getKey()).findFirst().get();
		System.out.println("First non repeating char :: " + c1);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%SORT ELEMENTS%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> sorting = Arrays.asList(10,15,8,49,25,98,98,32,15);
		sorting.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		sorting.stream().sorted().forEach(System.out::println);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%TRUE ELEMENTS IF ANY ELEMENT PRESENT TWISE%%%%%%%%%%%%%%%%%%%%%%%%");
		List<Integer> elemtns = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = elemtns.stream().collect(Collectors.toSet());
		if(set.size() == elemtns.size()) {
			System.out.println("Repeated elemtns not present");

		}else {
			System.out.println("Repeated elemtns present");
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%CONCATANATE two Streams%%%%%%%%%%%%%%%%%%%%%%%%");
		 List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	     Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
	     
		System.out.println("%%%%%%%%%%%%%%%%%%%DATE AND TIME API%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Local date " + LocalDate.now());
		System.out.println("Local time " + LocalTime.now());
        System.out.println("Local date " + LocalDateTime.now());
        
        int[] nums = {1};
        int my = Arrays.stream(nums).boxed().filter(n -> n%2==0).map(m -> m).
                collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting())).entrySet().stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue())).map(a -> a.getKey()).findFirst().orElse(-1);
        System.out.println("The even Number repated multiple times " + my);
        
		/*
		 * List<City> CITY_INPUT = Arrays.asList( new City("New York", "USA"), new
		 * City("Shanghai", "China"), new City("Hamburg", "Germany"), new City("Paris",
		 * "France"), new City("Paris", "Texas, USA"));
		 */
        
		/*
		 * Map<String, City> resultMap1 = CITY_INPUT.stream()
		 * .collect(Collectors.toMap(City::getLocation, Function.identity(), (first,
		 * second) -> first));
		 */
        
        int k = 9;
        
        boolean a = IntStream.range(2, k).noneMatch(n -> k%n ==0);
        
        System.out.println("Is it prime " + a);


	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
