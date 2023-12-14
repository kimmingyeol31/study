# stash
> ### stash  
> 1. (안전한 곳에) 넣어 두다, 숨기다
> 2. 챙겨 둔(숨겨 둔) 양

사전적 정의처럼 커밋할 필요 없이 파일의 변경 사항을 숨기거나 비밀리에 저장할 수 있는 도구. 
`.git` 폴더 내부 임시 저장소에 작업 영역과 스테이징 영역의 내용들을 저장해뒀다가 다시 가져올 수 있는 기능.  
<br>

### 스택
임시 저장소는 스택(stack) 구조로 되어있다. 가장 최근의 내용이 가장 위에 저장되고, 가장 먼저 나가는 구조(Last in - First Out).  
<br>

### stash를 사용하는 이유
작업 디렉토리와 스테이징 영역이 말끔한 상태(nothing to commit, working tree clean)가 아닐 경우엔 원칙적으로 다른 브랜치나 이전 커밋으로 이동할 수 없다.  

stash를 사용하면 저장 시 작업 디렉토리와 스테이징 영역의 내용이 stash에 저장되고, 작업 디렉토리와 스테이징 영역엔 깃 저장소의 가장 마지막 커밋 상태로 돌아간다.  

→ 즉, 현재 모든 변경 사항들을 stash에 넣어두면 말끔한 상태가 되어서 다른 브랜치로 이동하거나 이전 커밋으로 이동할 수 있다.  
<br>

### stash 저장하기
```
$ git stash [(-m | --message) <message>] [-k | --keep-index] [-u | --include-untracked] [-p | --patch]
$ git stash save [<message>] [-k | --keep-index] [-u | --include-untracked] [-p | --patch]
```
`--message <message>`, `-m <message>`
- 메시지를 포함하여 저장한다

`--keep-index`, `-k`
- 스테이징 영역은 제외하고 작업 디렉토리만 저장한다
- 스테이징 영역이 비어있지 않으므로 checkout이 불가능함

`--include-untracked`, `-u`
- untracked 파일도 포함해서 저장한다

`--patch`, `-p`
- 모든 변경사항을 저장하지 않고, 대화형 프롬프트를 통해 stash에 저장할 것과 저장하지 않을 항목을 선택한다.  
<br>

### 임시 저장된 stash 반영하기
```
$ git stash apply [--index] [<stash>]
```

`--index`
- 임시 저장된 내용을 가져올때 기본적으로 작업 디렉토리에만 반영하지만, 이 옵션을 사용하면 스테이징 영역에도 반영된다

`<stash>`
- 가져올 변경 사항 내용을 지정한다
- `stash@{n}`과 같은 식으로 인자를 대입하면 됨  
<br>

### 임시 저장된 stash 반영하고 삭제하기
```
$ git stash pop [--index] [<stash>]
```
> 💡 `apply`는 stash를 가져와서 반영만 하지만, `pop`은 반영 후 stash를 삭제한다는 차이점이 존재함  
<br>

`--index`
- 임시 저장된 내용을 가져올때 기본적으로 작업 디렉토리에만 반영하지만, 이 옵션을 사용하면 스테이징 영역에도 반영된다

`<stash>`
- 가져올 변경 사항 내용을 지정한다
- `stash@{n}`과 같은 식으로 인자를 대입하면 됨  
<br>

### 임시 저장된 내용 확인하기
```
$ git stash list

stash@{0}
stash@{1}
stash@{2}
...
```
저장된 모든 stash 항목을 표시한다. 가장 위에 있는 `stash@{0}`이 가장 최근에 저장된 내역이다.  
<br>

```
$ git stash show [<stash>] [-p]
```
stash가 처음 생성되었을 때의 커밋과 stash에 기록된 내용 간의 차이를 비교한다. 변경점이 있는 파일과 변경점 수만 간단히 표시한다.

`<stash>`
- 확인할 stash를 특정한다
- `stash@{n}`과 같은 형식으로 인자를 대입함

`-p`
- `git diff`처럼 변경된 내용의 차이까지 상세하게 표시한다  
<br>

### stash 삭제하기
```
$ git stash drop [<stash>]
```
최근 임시저장 내용이나 특정 임시저장 내용을 삭제한다.

`<stash>`
- 삭제할 특정 stash를 지정한다.
- 인자를 추가하지 않을 경우 가장 최근에 저장된 항목이 삭제된다.  
<br>

```
$ git stash clear
```
모든 임시저장 내용을 삭제한다.