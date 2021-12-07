package DesignPattern.ProxyPattern;

public interface Thumbnail {
    public void showTitle();
    public void showPreview();
}

class RealThumbnail implements Thumbnail{
    private String title;
    private String movieUrl;

    public RealThumbnail(String title, String movieUrl){
        this.title = title;
        this.movieUrl = movieUrl;
        //시간이 걸리는작업이라 가정
        System.out.println("마우스가 오버 되었습니다.");
        System.out.println("실제 객체가 생성 되었습니다.");
    }
    @Override
    public void showTitle(){  System.out.println("제목 : " + this.title);}
    @Override
    public void showPreview(){ System.out.println(this.title + "의 미리보기 재생"); }

}

class ProxyThumbname implements Thumbnail{
    private String title;
    private String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbname (String title, String movieUrl){
        this.title = title;
        this.movieUrl = movieUrl;
    }
    @Override
    public void showTitle(){System.out.println("제목 : " + this.title);}
    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(this.title, this.movieUrl);
        }
        realThumbnail.showPreview();
    }
}