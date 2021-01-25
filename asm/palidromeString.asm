.model small
.stack 100h
.data
    str db 'bcba$'
    isP db 'Doi xung$'
    isNP db 'Khong doi xung$'
.code
    main proc
    mov ax,@data
    mov ds,ax
    
    lea si, str ; load the starting address of string
    
    ; traverse to the end of the string
    loop1:
        mov ax,[si]
        cmp al,'$'
        je  lb1
        inc si
        jmp loop1
        
    ; load the starting address if the string
    lb1:
        lea di, str
        dec si      ; point to the last digit of str
        
        ; traverse to the end of the string
        ; check str is palidrome or not ?
      loop2:
        
        cmp si,di 
        jl isPalidrome
        mov ax, [si]
        mov bx, [di]
        cmp al,bl
        jne isNotPalidrome
        
        dec si
        inc di
        jmp loop2
        
      isPalidrome:
        lea dx,isP
        mov ah,9
        int 21h
        jmp thoat
        
      isNotPalidrome:
        lea dx,isNP
        mov ah,9
        int 21h  
      
      thoat:
        mov ah,4ch
        int 21h
        
     main endp
     end main          
        
     