<%-- 
    Document   : reproduccion
    Created on : 26-abr-2021, 16:26:41
    Author     : micky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//vjs.zencdn.net/7.10.2/video-js.min.css" rel="stylesheet">
        <script src="//vjs.zencdn.net/7.10.2/video.min.js"></script>
        <!-- If you'd like to support IE8 (for Video.js versions prior to v7) -->
        <!-- <script src="https://vjs.zencdn.net/ie8/1.1.2/videojs-ie8.min.js"></script> -->
    </head>
    <body>
<!--        <video
            id="my-player"
            class="video-js"
            controls
            width="560" height="315"
            data-setup='{ "techOrder": ["youtube"], "sources": [{ "type": "video/youtube", "src": "https://www.youtube.com/watch?v=iRusbYIyRNI"}] }'
            data-setup='{"techOrder": ["youtube"], "sources": [{ "type": "video/youtube", "src": "${url}"}] }'>
            <source src="https://vod-progressive.akamaized.net/exp=1619478450~acl=%2A%2F936994598.mp4%2A~hmac=a3d9435b775abc6acea8348bf91d3203a491d8ee0e883e568409fc3bf66c0313/vimeo-prod-skyfire-std-us/01/1227/10/256138500/936994598.mp4" type="video/mp4"></source>
            <source src="https://www.youtube.com/watch?v=WE4AJuIvG1Y" type="video/youtube"></source>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a
                web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">
                    supports HTML5 video
                </a>
            </p>
        </video>-->
        <form action="http://localhost:8080/RESTService/webresources/videos/${id}/reproducciones" method="post">
            <input type="submit" name="submit" value="Play"/>
        </form>
        <!--<button onclick="_vplayer.play()">play</button>-->
        <br><br>
        <a href="<%= request.getContextPath() %>/busqueda.jsp">Buscar video</a>
        <br><br>
        <a href="<%= request.getContextPath() %>/video.jsp">Insertar video</a>
        <br/><br/>
        <a href="<%= request.getContextPath() %>/logout.jsp">Logout</a>
    </body>
</html>
