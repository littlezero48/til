# branch

* branch 생성

```bash
git branch [new branch name]
```

새로운 브랜치를 생성한다. 
<br>

---

* branch list 보기

```bash
git branch
```

로컬 브랜치를 조회한다.

<br>

> 옵션
> 
> -r : remote branch list를 보여준다

<br>

------

* branch 삭제

```bash
git branch -d [branch name]
```

로컬 브랜치를 제거한다.

<br>

> 옵션
> 
> -d  를 -D로 교체 : 강제 삭제된다.

<br>

----

* remote branch 삭제

```bash
git push origin --delete [remote branch name]
```

원격 브랜치를 삭제한다. remote branch name에서 origin 제외
