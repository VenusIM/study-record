# OOP

**[Object - Oriental Programming]**

Real World를 System에서 표현하는 방법론이다. 현재 대체할 만한 방법론이 없고, 가장 많이 사용되는 방법론이다.

![Object and class.PNG](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Object_and_class.png)

**Object**

: Real World에 존재하는 물리적인, 개념적인 모든 것을 의미한다.

**Abstraction** 

: Object들의 공통적인 state, attribute, behavior을 추출해 내는 과정을 의미하고, 어떤 System을 구현할 것 인가에 따라 추출해야 하는 infomation이  달라 문제 영역에 의존적이다.

**Class**

: Object들을 system에  Abstraction되어 나온 공통적인 부분을 모은 Filed(변하지 않는 state와 behavior로 인해 변하는 attribute, Method(behavior)로서 표현한 것을 identify이 있는 명칭으로 만든 것이 Class이다.

**Field**

: Java Language로 Code를 표현할 때, Attribute와 Behavior을 통해 Attribute이 변하는 State를 Declaration 하는 과정을 통칭한다. Field를 생성하는 것을 Static Modeling이라고 한다.

**Method**

: Java Language로 Code를 표현할 때, Behavior를 생성하는 과정을 통칭한다. Method를 생성하는 것을 Dynamic Modeling이라고 한다.

**Return**

 Message를 주고 받는 행위

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled.png)

**Void**

: return 값이 없는 Method를 의미한다.

**Data Type Method( )**

: return 값의 Data Type에 따라 다양한 Data Type을 선언해줄 수 있다.

**Object Modeling**

: Real World의 Object들을 시스템 상에 class로 표현하는 과정을 의미이며, Static Modeling과 Dynamic Modeling을 하는 전체 과정이다. main Method 가 없는 bean이라고 명칭한다.

### Class의 Reference

- Syntax
    
    ```java
    Mouse m = new Mouse();
    ```
    
    1. Mouse라는 이름을 가진 bean의 Data Type을 갖고 있는 Variable m이라는 Identifier 생성
        
        Real World의 Object를 Encapsulation & Abstraction한 bean인 Mouse.
        
    2. Current Directory에서 Mouse.class라는 File을 찾은 후 new라는 Keyword를 통해 memory에 할당되고 Mouse.class라는 File의 Field와 Method가 할당된 공간에 적재된다. (Instance화)
    3. 적재된 내용을 main method가 존재하는 Application Class에서 참조한다.
    

<aside>
💡 **물리적으로 다른 Class가 어떻게 다른 Class의 위치를 알고 Memory에 할당하는 것일까?**
우선 이 내용을 이해하려면 Command에서 . 과 .. 의 의미를 알아야 한다.
. 은 Current Directory 즉, 현재를 의미하고 .. 은 Parent Directory 즉, 상위를 의미한다.
classpath의 default는 . 으로 현재 Directory에서 해당 Class를 불러와 memory에 할당한다. classpath를 직접 지정해 주는 방법도 가능하다.
추가적으로 Command Line은 Java와 다르게 대/소문자를 구분하지 않는다.

</aside>

### Bean에 2EA 이상 Class

: Class는 relationship을 갖고 효율적인 Modeling을 해야 한다.

### Relationship[관계]

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%201.png)

- SubClass의 공통적인 Field와 Method를 뽑아 내어 SuperClass를 생성하여
    
    재 사용성, extends[확장성], Consistency[일관성]을 높였다.
    
    - 확장성의 예
        
        ```java
        public class 독수리 extends 동물{
        String 날개크기;
        }
        ```
        
        동물class 의 이름, 이동방식을 확장하여 날개크기라는 attribute를 추가한다
        
    - 일관성의 예
        
        SuperClass의 Field Name을 삭제하면 SubClass가 확장하고 있던 관계에 영향을 미친다.
        
    
    But, 이런 구현 과정 등에서 초기 비용이 많이 들어가는 명확한 단점이 있지만 장기적으로 봤을 때 유리하다.
    
- SuperClass는 SubClass의 공통적인 부분만 뽑아내 생성한 Class이므로
    
    SubClass를 대신할 수 없지만, SubClass는 SuperClass로 대신할 수 있다.
    
- Generalization과 Specialization을 통해 Class의 Relationship이 정의되고,
    - Hierarchy된 구조라고 한다.
        
        Hierarchy라는 구조를 통해 재 사용성, 확장성, 일관성을 좋게 한다.
        즉, 유지 관리를 좋게 한다.
        
    
    ![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%202.png)
    

---

### Inheritance[상속]

- Generalization, Specialization Relationship을 의미한다
    
    SuperClass는 SubClass들의 공통적인 Filed와 Method를 Abstraction하여 포함하고 있는 Relationship이다.
    
    Generalization, Specialization의 Relationship는 SuperClass의 information을 공유를 하는데, 이러한 것을 의미한다. extends라는 Key Word를 이용하여 확장한다.
    
    ⇒ java에서는 단일 상속만 지원한다.
    
    ![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%203.png)
    
    **Extends (~ is a ~);**
    
    : 다른 class를 확장하여 기능을 추가한다.
    
    ⇒ Overriding, Overloading 기술 적용
    
    - Syntax
        
        ```java
        class A{
        String name = "홍길동";
        int age = 20;
        }
        
        class B extends A{
        String job = "개발자";
        }
        
        class C extends A{
        String school = "서울대학교";
        }
        
        class BTest{
        	public static void main(String[] args){
        		B b = new B();
        		C c = new C();
        		System.out.println(b.name); // 홍길동
        		System.out.println(b.address); //compile error
        		System.out.println(c.name); // 홍길동
        }
        
        ```
        
        <aside>
        💡 Compile Error가 왜 날까?
        ⇒ A를 확장하여 B의 내용을 추가했지만, A에도 B에도 없는 정보를 호출했기 때문이다.
        
        </aside>
        
        - **Constructor[생성자]**
            
            : new라는 keyword를 통해 생성할 때 호출되는 특별한 Method  
            
             Object는 서로 다른 상태를 가져야 하지만, 똑같은 상태를 만들어 놓고 일일이 변경해 주어야 한다는 Issue가 있다. default이기에 bean에 작성하지 않아도 생성된다.
            
            ⇒ Overloading 기술을 적용하여 매개 변수에 인자를 받아 초기화해 줌으로서 Issue를 해결한다.
            
            ```java
            //issue
            public class A{
            	//Field
            	String name;
            	//costructor (default)
            	public A(String name){
            		name = 홍길동;
              }
            	//method
            
            	//main
            	public static void main(String[] args){
            	A a = new A(); // new라는 KeyWord를 통해 생성자가 호출된다.
            	A b = new A();
            	A c = new A();
            
            	System.out.println(a.name); //홍길동
            	System.out.println(b.name); //홍길동
            	System.out.println(c.name); //홍길동
            	}
            }
            //====================================================================
            //Overloading 기술 적용 매게변수를 통해 인자 값을 받아 유연하게 사용 가능
            public class A{
            	//Field
            	String name;
            	//costructor
            	public A(String n){
            	name = n;
            	}
            	//method
            
            	//main
            	public static void main(String[] args){
            	A a = new A("홍길동"); // new라는 KeyWord를 통해 생성자가 호출된다.
            	A b = new A("이순신");
            	A c = new A("김유신");
            
            	System.out.println(a.name); //홍길동
            	System.out.println(b.name); //이순신
            	System.out.println(c.name); //김유신
            	}
            }
            ```
            
            > 매개 변수 [Parameter] :  Constructor, method 등에 추가해주는 변수
            인자 [arguments] : 매개 변수에 입력될 값
            > 
            
            <aside>
            💡 Field = Instance variable, Member variable, Attribute variable라고 명칭 할 수 있다.
            ⇒ **Instance variable이라고 명칭 하는 이유?**
            new라는 Key Word로 bean을 Instance화 하고 참조하여 사용하기 때문이다.
            ⇒ **Member variable이라고 명칭 하는 이유?**
            선언된 variable의 class 내부에서만 유효하기 때문이다.
            
            </aside>
            
            - Super()
                
                : Super(인자 값)을 통해 Overloading 기술이 적용되며, Inheritance 관계에 있는 상위 Class에서 인자 값의 Data Type과 동일한 Data Type을 가지고 있는 Constructor을 호출한다.
                
                **constructor에서 만 사용 가능하며, constructor에서 가장 먼저 호출된다**.
                
                ```java
                class A{
                	public A(String i){
                		System.out.println("첫번째 출력");
                	}
                }
                
                class B extends A{
                	
                	public B(String j){
                		super(String j); // Class A에서 String Data Type을 찾아 간다.
                		System.out.println("두번째 출력");
                	}
                	public static void main(String[] args){
                		B b = new B("출력");
                	}
                }
                		
                ```
                
            - This()
                
                : This(인자 값)을 통해 현재 Class에서 인자 값의 Data Type과 동일한 Data Type을 가지고 있는 Constructor을 호출한다. 즉, 재귀한다 .
                
                **constructor에서 만 사용 가능하며, constructor에서 가장 먼저 호출된다.**
                
                ```java
                class B{
                	
                	public B(){
                		this(String i); // Class B에서 String Data Type을 찾아 간다.
                		System.out.println("두번째 출력");
                	}
                
                	public B(String i){
                		System.out.println("첫번째 출력");
                	}
                
                	public static void main(String[] args){
                		B b = new B();
                	}
                }
                ```
                
            
            - Super.
                
                 instance variable, method
                
                ```java
                class A{
                	int a;
                	int b;
                	//constructor
                	//method
                	public int c(){
                		System.out.println(a);
                	}
                }
                //======================================
                class B extends A{
                	super.a;   //int a
                	super.c(); //System.out.println(a)
                }
                ```
                
            - This.
                
                instance variable, method
                
                ```java
                class A{
                	int a;
                	int b;
                	//constructor
                	public A(int a){
                		this.a = a;
                	}
                	//method
                	}
                }
                
                ```
                
    

---

### Polymorphism[다형성]

: Real World에서 사용법만 알고 있으면 사용법에 해당하는 기능을 갖고 있는 사물이 어떤 제조사 사물이던 사용 가능하다.

- Java Language에서 [Method Overloading](https://www.notion.so/OOP-3ca41010cdb146de9ffa0ff99e5b9f90), [Method Overriding](https://www.notion.so/OOP-3ca41010cdb146de9ffa0ff99e5b9f90), Abstract Method, Abstract Class, Interface등으로 System에 구현할 수 있다.

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%204.png)

**Overloading**

제조사 별로 추가적인 기능은 달라도 공통적인 마우스의 기능, 공통적인 운전 방법은 우리가 알고 있다.

하나의 예로 동일한 method Name이지만 arguments의 Data Type의 종류와 개수에 따라 무수히 많은 Class가 존재한다.

```java
///method overloading
public void class mouse(기능1){
}

public void class mouse(기능1, 기능2){
}

public void class mouse(기능1, ....){
}
```

### 

### Method Overloading

: 다형성을 지원하는 기술로 동일한 name을 갖고 있는 method에 parameter 선언해 주고, 입력 받는 arguments의 Data Type, 개수 등에 따라 다른 기능을 수행할 수 있게 해준다.

⇒ 하나의 bean과 class에서 사용하는 기술이다.

### Method Overriding

:  Superclass의 Method의 이름을 Subclass에 복제하여 필요한 내용으로 재 정의 하는 기술

```java
public class A{
	public void charge(){
		System.out.println("학생: 300, 일반인: 500");
	}
}
public class B extends A{
	public void charge(){
		System.out.println("학생: 300");
}
```

---

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%205.png)

### Encapsulation[캡슐화]

- : Object의 Field와 Method의 Information Hiding을 의미한다.
    - public과 privite등의 modifier을 통해 정보의 공개 여부를 결정한다. 또한 setter / getter Method를 통해 Information Hiding된 정보에 접근한다.
    
    ex) 친분이 있는 사람에게는 이름, 나이 등의 정보를 알려주지만
    
    친분이 없는 사람에게는 통상적으로 이름, 나이 등을 쉽게 알려주지 않는다.
    

**Package**

- 파일 시스템의 폴더를 이용하여 **클래스 파일을 묶어서 관리**하기 위한 수단
- 패키지에 의한 장점
    - 패키지마다 별도의 이름 공간 (Namespace)이 생기기 때문에 **클래스 이름의 유일성을 보장**
    - class를 패키지 단위로도 제어할 수 있기 때문에 좀 더 세밀하게 access modify

 Class의 묶음으로, Window에서 명칭 하는 Folder, U/Linux에서 명칭 하는 Directory를 java에서의 명칭이다. (. 으로 CSV한다 ⇒ Window에서 \ , U/Linux에서 /와 같은 CSV를 의미한다.)

동일한 package name으로 인한 충돌을 미연에 방지하기 위해 unique하게 만들어 주어야한다.

⇒ 회사 도메인 혹은 개인 도메인을 뒤집어 소문자로 표기하는 것을 원칙으로 한다.

(소문자로 작성하는 이유는 도스 창에서 대/소문자 구분을 하지 않기 때문이다.)

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%206.png)

```java
package a.b //a 하위에 b라는 package에 .class 파일 저장
import a.c //a 하위에 c라는 package를 호출하고 싶을 경우 사용
//가독성을 위해 import.* 보다는 어떤 것을 불러와 사용하는지 명시하는 코딩을 하자.
```

<aside>
💡 Eclipse와 같은 Develop Platform에서 패키지를 어떻게 자동 생성해 주는 것일까?
Compile을 진행하면, cmd의 명령어 javac -d . classname.java를 실행하고,  명시 되어 있는 현재package하위에 packagepath에 classname.class를 생성해준다.

javac -d . classname.java는 아래의 과정을 함축하고 있다.
1. mkdir을 통한 현재 경로 하위에 package생성
2. move 명령어로 compile해서 나온 .class packagepath로 이동

</aside>

### Reference Data Type을 사용할 수 있는 이유

그렇다면 우리가 사용하고 있는 Reference Data Type을 어떻게 참조할 수 있는 것일까?
⇒ ~~classpath의 default가 .; C:\Program Files\Java\jdk1.8.0_181\jre\lib\rt.jar; 이기 때문이다.~~

classpath의 Default가 rt.jar를 포함한 library의 모든 .jar와 User Project의 경로이기 때문이다.
~~~~
즉, ~.jar는 java의 압축 기술이고 rt(runtime)이라는 압축 폴더 내의 class를 참조해 주기 때문에 우리가 Reference Data Type을 사용할 수 있는 것이다.

```java
public class A{
	String name = new String();
	java.lang.String = new java.lang.String(); //스트링의 path를 명시해 줌으로서 사용 가능하다
}

//일일히 작성하는 번거로움을 해소 하기 위해 import를 통해 전역에 영향을 미칠수 있다.
import java.lang.String
public class B{
	String name = new String();
}

// 그러나 java.lang.*이 default 값이기에 생략되고 사용할 수 있다.
public class C{
	String name = new String();
}
```

### JDK

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%207.png)

**Access Modifier[접근 제어자]**

: Encapsulation을 지원하는 Keyword

- **Public** : 누구나 접근 가능한 것
    
    ex) 외부의 공용 화장실
    
    ```java
    public class A{
    		public int a(){
    				System.out.println("누구나 접근 가능합니다.");
    	}
    }
    ===================================================
    class B{
    	public static void main(String[] args){
    		A a = new A();
    		a.a();
    	}
    }
    ```
    
- **Private**: 같은 class 내에서만 접근 가능한 것
    
    ex) 내부의 거실 화장실
    
    ⇒  월세를 살고 있는 사람, 구성원 모두 거실 화장실을 이용하는 것을 허용한다.
    
    ```java
    public class A{
    		private int a(){
    				System.out.println("같은 클래스 내에서만 접근 가능합니다.");
    	}
    }
    ===================================================
    class B{
    	public static void main(String[] args){
    		A a = new A();
    		a.a();
    	}
    }
    ```
    
- **Protected**: 같은 package 내부, 외부에서 상속 관계에 subclass만 접근 가능한 것
    
    ex) 월세를 살고 있는 사람은 안방의 화장실을 이용 못하지만, 출가한 아들이 오랜만에 안방 화장실에 접근하는 것은 허용한다.
    
    ```java
    public class A{
    	Protected int a(){
    		System.out.println("같은 패키지 내이면서 상속관계에서 접근 가능합니다.");
    		}
    }
    ===================================================
    class B extends A{
    	public static void main(String[] args){
    		A a = new A();
    		a.a();
    	}
    }
    ```
    
- **(default)** : 같은 package 내에서만 접근 가능한 것이고 생략 가능하다.
    
    ex)  부모님은 상세한 월급 내역을 모르지만 회사 인사 팀에서는 알고 있다. 
    
    ```java
    class A{
    		int a(){
    				System.out.println("같은 패키지 내에서만 접근 가능합니다.");
    	}
    }
    ===================================================
    class B{
    	public static void main(String[] args){
    		A a = new A();
    		a.a();
    	}
    }
    ```
    

![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%208.png)

```java

public static void main(String[] args)
/*누구나 접근 가능하고, static 영역에 할당되어 프로그램이 끝날때까지 유지되고
 return 값이 없는 String array Data Type을 갖고 있는 args에 인자 값을
 저장해 주는 main method
	default가 classpath.java.lang이기 때문에 String을 import 없이 사용 가능
*/

System.out.println();
/*default가 classpath.java.lang이기 때문에 System을 import 없이 사용 가능
  API 문서를 보면 System의 필드에 out(printStream Data Type을 갖고 있는 class)의 
	method인 println()을 호출하여 사용한다.
*/
```

**Modifier**

- **static**
    
    static keyword를 통해 memory의 static영역에 할당하고, 모든 instance에서 공유하여 하나로 쓸 수 있다는 장점이 있다. Garbage Collector의 관리를 받지 않아 프로그램 종료 시까지 계속 메모리를 차지 하기 때문에 속도에 영향을 미친다. 
    
    ⇒ classname.~을 원칙으로 하며 class method는 instance 생성 없이 호출 가능하다.
    
    ![Untitled](OOP%203ca41010cdb146de9ffa0ff99e5b9f90/Untitled%209.png)
    
    > [https://sujl95.tistory.com/75](https://sujl95.tistory.com/75)
    > 
- **final**
    
    중요한 정보를 외부 인이나 제한된 인원에게 접근하지 못하도록 하기 위해 사용하는  keyword
    
    한국어로 마지막이라는 뜻을 가지고 있는 만큼, 더 이상 변경하지 않을 경우 사용한다.
    
    final variable :  상수
    
    final class      :  extends 하여 사용하지 못하게 한다.
    
    final method :  overriding 불가능
    
- **abstract**
    
    abstract Method() : 추상화 된 method로 선언 부는 있지만 내용이 없다.
    
    abstract Class : abstract method가 하나 이상 있을 경우 naming해 준다.
    
    ```java
    abstract class A{
    	//Field
    	//method
    	abstract void save(); // 사용하지 않는데 추상화를 할 이유가 있을까?
    }
    
    ```
    
    overriding 기술이 강제적이  되고, class명 앞에도 추상화 된 것이라고 명시해준다.
    
    why? 
    
    추상화 하여 선언 부만 만들어 놓은 것이다 보니, 확장하여 overriding기술을 무조건적으로 적용하여 기능을 추가해야 추상화 하여 선언 부를 정의한 의미가 있기 때문이다.
    

- Dependency(의존성)

       : 잠시 사용하고 두고 가는 개념 (학원의 컴퓨터)

```java
class A{

	강의하다(){
		B b = new B();
		b.~;
	}
}

class B{

```

- Association (has a ~)
    
    : 소유하는 개념 (개인 노트북)
    

### Reference Type Casting

: has/is a Relationship을 갖고 있는 Super class와 Sub class 간의 형 변환

```java
class Super {
	public void a() {
		System.out.println("Super : a()");
	}
}

class Sub extends Super {
	public void a() {
		System.out.println("Sub : a()");
	}

	public void b() {
		System.out.println("Sub : b()");
	}
}

public class CastingComplete {
	public static void main(String[] args) {
		System.out.println("Super s1 = new Super()");
		Super s1 = new Super();
		s1.a(); //Super : a()

		System.out.println("Sub s2 = new Sub()");
		Sub s2 = new Sub();
		s2.a(); //Sub : a()
		s2.b(); //Sub : b()

		System.out.println("Super s3 = new Sub()");
		//묵시적 형변환
		Super s3 = new Sub();
		s3.a(); //Sub : a()
	//부모님한테 천원이 있었어요. 자식은 부모님에게 천원을 받아 껌를 샀습니다.
	//부모의 입장에서 가지고 있던 돈이 자식에게서 껌으로 변했으니 껌을 참조한다.
	//s3.b(); //=>error, s3는 b()를 참조할 수 없다.

		//명시적 형변환
		Sub sub = (Sub)s3;
		sub.b(); //Sub : b()
		
```

- Interface
    
    : 일종의 abstract class보다 추상화 정도가 높고, 추상화 되지 않은 method 또는 member variable을 구성원으로 가질 수 없다. 즉, 상수와 추상 method들로 구성되어 있는 interface
    
    ```jsx
    iterface 인터페이스이름{
    	(public static final) 타입 상수 이름 = 값; //public static final은 생략 가능
    	(public abstract) method 이름(매개변수);   //public abstract는 생략 가능
    }
    ```
    

- Garbage Collector
    
    garbage collector :  Heap 영역의 Object 중 stack 에서 도달 불가능한 (Unreachable) Object들을 처리하는 기능.
    garbage collecting : Heap 영역의 Object 중 stack 에서 도달 불가능한 (Unreachable) Object들을 처리하는 과정
    garbage collection : garbage collector가 garbage collecting하는 모든 과정
    
    ```jsx
    public class A{
    	
    	public void a(){
    	}
    
    }
    public class B{
    	A a = new A();
    	a.a();
    	a = null; // reference가 해제되며 Garbage Collector에 의해 제거된다.
    
    	A.a(); //참조 값이 없기 때문에 한번 호출 후 Garbage Collector에 의해 제거된다.
    ```
    

[Method Syntax](https://www.notion.so/Method-Syntax-97b0baceea2b4474bb5d8aac1e9de9df)
