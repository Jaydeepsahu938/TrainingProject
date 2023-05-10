package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.traineeingproject.databinding.ActivityRetrofitExBinding
import retrofit2.Response

class RetrofitEx : AppCompatActivity() {
    private val rBinding by lazy {
        ActivityRetrofitExBinding.inflate(LayoutInflater.from(this))
    }
    private lateinit var retrofitInstance: AlbumService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(rBinding.root)
        retrofitInstance = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)

        rBinding.btnGetAll.setOnClickListener {
            getAll()
        }
        rBinding.btnGetPath.setOnClickListener {
            getResponsePathParameter()
        }
        rBinding.btnGetSorted.setOnClickListener {
            getResponseQuery()
        }
        rBinding.btnPost.setOnClickListener {
            uploadAlbum()
        }
    }

    private fun getResponsePathParameter(){
        rBinding.textView.text = ""
        val pathResponse : LiveData<Response<AlbumItem>> = liveData {
            val response = retrofitInstance.getPathedAlbum(5)
            emit(response)
        }

        pathResponse.observe(this, Observer {
            val title = it.body()?.title
            rBinding.textView.text = title
        })
    }

    private fun getAll(){
        rBinding.textView.text = ""
        val responseLiveData: LiveData<Response<Album>> = liveData {
            val response = retrofitInstance.getAlbums()
            emit(response)
        }

        responseLiveData.observe(this, Observer {
            val albumList = it.body()?.listIterator()
            if (albumList!=null){
                while (albumList.hasNext()){
                    val albumItem = albumList.next()
                    val result = " "+"Album title : ${albumItem.title}"+"\n"+
                            " "+"Album id : ${albumItem.id}"+"\n"+
                            " "+"User id : ${albumItem.userId}"+"\n\n\n"
                    rBinding.textView.append(result)
                }
            }
        })
    }

    private fun getResponseQuery(){
        rBinding.textView.text = ""
        val responseLiveData: LiveData<Response<Album>> = liveData {
            val response = retrofitInstance.getSortedAlbums(1) //with query
            emit(response)
        }

        responseLiveData.observe(this, Observer {
            val albumList = it.body()?.listIterator()
            if (albumList!=null){
                while (albumList.hasNext()){
                    val albumItem = albumList.next()
                    val result = " "+"Album title : ${albumItem.title}"+"\n"+
                            " "+"Album id : ${albumItem.id}"+"\n"+
                            " "+"User id : ${albumItem.userId}"+"\n\n\n"
                    rBinding.textView.append(result)
                }
            }
        })
    }

    private fun uploadAlbum(){
        rBinding.textView.text = ""
        val album = AlbumItem(5, "Save new title", 5)
        val postResponse : LiveData<Response<AlbumItem>> = liveData {
            val response = retrofitInstance.uploadAlbum(album)
            emit(response)
        }
        postResponse.observe(this, Observer {
            val receivedAlbumItem = it.body()
            val result = " "+"Album title : ${receivedAlbumItem?.title}"+"\n"+
                    " "+"Album id : ${receivedAlbumItem?.id}"+"\n"+
                    " "+"User id : ${receivedAlbumItem?.userId}"+"\n\n\n"
            rBinding.textView.append(result)
        })
    }
}