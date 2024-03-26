# Un horario

## Vista pública de clases

||Subject|
|-|-|
|✅|public Subject(String name, String code, int credits)
|✅|public Subject(String name)
|✅|public String show()
|✅|public String showCode()

| |Schedule|
|-|-|
|✅|public Schedule()
|✅|public void addSubject(Subject subject, int day, int hour)
|✅|public String showSchedule()
|☑️|public void exchangeSubjects(int firstDay, int firstHour, int secondDay, int secondHour)

## Vista pública de objetos

Dentro del `main()` de `Schedule`:

```java
    Schedule schedule = new Schedule();
    
    Subject asignatura = new Subject("Progamacion 1", "Prg1",0);
    schedule.addSubject(asignatura, 1, 1);
    schedule.addSubject(asignatura, 1, 2);

    asignatura = new Subject("Matemática 1", "mat1", 6);
    schedule.addSubject(asignatura, 1, 3);
    schedule.addSubject(asignatura, 1, 4);

    asignatura = new Subject("Proyectos");
    schedule.addSubject(asignatura, 4, 2);

    System.out.println(schedule.show());
```

## Vista privada de clases

<div align=center>

|[Subject](/src/Subject.java)|[Schedule](/src/Schedule.java)|
|-|-|

</div>

## Ejecución


```
 PRG1  ----  ----  ----  ---- 
 PRG1  ----  ----  PROY  ---- 
 MAT1  ----  ----  ----  ---- 
 MAT1  ----  ----  ----  ---- 
 ----  ----  ----  ----  ---- 
 ----  ----  ----  ----  ---- 
 ----  ----  ----  ----  ---- 
 ----  ----  ----  ----  ---- 
```
