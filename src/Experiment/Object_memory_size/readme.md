# 객체 안에 메소드가 많아지면 저장되는 메모리도 커지는지 확인
## Collections.sort를 다시 학습하는 도중 객체 클래스에 구현하는 방법과 람다로 작성하는 두 방법이 있어서 만약 객체 안에 구현하면 메모리가 늘어나는지 궁금해짐
## 사용한 메모리로 확인

## 결과 : 유의미한 차이는 없다

## 따로 찾아본 결과로도 class의 생성자나 method들은 메모리의 Method Area에 저장되니 크게 늘어나지 않는다는걸 알 수 있었다. 