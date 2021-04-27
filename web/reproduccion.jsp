<%-- 
    Document   : reproduccion
    Created on : 26-abr-2021, 16:26:41
    Author     : micky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https:////vjs.zencdn.net/7.10.2/video-js.min.css" rel="stylesheet">
        <script src="https://vjs.zencdn.net/7.11.4/video.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/videojs-youtube/2.0.4/Youtube.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    </head>
    <body>
        <video id="my-player" class="video-js vjs-default-skin" controls preload="none" width="640" height="360"
            data-setup='{"techOrder":["youtube","html5"],"ytcontrols":false}'>
          <source src="${url}?showinfo=0&enablejsapi=1&origin=http://localhost:8080" type='video/youtube' />
        </video>
        <br><br>
        <a href="<%= request.getContextPath() %>/listadoVideos">Ver videos</a>
        <br><br>
        <a href="<%= request.getContextPath() %>/video.jsp">Insertar video</a>
        <br/><br/>
        <a href="<%= request.getContextPath() %>/logout.jsp">Logout</a>
    </body>
    <script>
            var player = videojs("my-player");
            player.bigPlayButton.on('click', function(){
                // do the action
                makeAjaxRequest();
                player.play()
            });
            
            function makeAjaxRequest() {
                $.ajax({
                    url: 'http://localhost:8080/RESTService/webresources/videos/${id}/reproducciones',
                    type: 'PUT',
                    crossDomain: true,
                    success: function(data){
                      console.log("actualización exitosa")
                    }
                });
              }
        </script>
</html>
